//Question 41:
//For positive integers a and b, we say that a fraction a/b is good if it is equal to m/(m+1) for some positive integer m.
//
//You are given an integer N. Find the number of pairs of integers i,j such that 1≤i,j≤N and the fraction (i/(i+1))⋅((j+1)/j) is good.
//
//Input Format
//
//The first and only line of the input contains a single integer N.
//
//Constraints
//
//1≤N≤1,000,000
//
//Output Format
//
//Print a single line containing one integer ― the number of pairs of integers i,j (1≤i,j≤N) such that (i/(i+1))⋅((j+1)/j) is good
import java.io.OutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.stream.IntStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Arrays;
import java.io.BufferedWriter;
import java.util.Collection;
import java.util.InputMismatchException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.stream.Stream;
import java.io.Writer;
import java.io.OutputStreamWriter;
import java.io.InputStream;
public class Good_Fractions {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        OutputWriter out = new OutputWriter(outputStream);
        Fractions solver = new Fractions();
        solver.solve(1, in, out);
        out.close();
    }

    static class Fractions {
        int[] getCoeffs(int[] n, int[] a) {
            int prod = Arrays.stream(n).reduce(1, (i, j) -> i * j);

            int[] coeffs = new int[n.length];
            for (int i = 0; i < n.length; i++) {
                int p = prod / n[i];
                coeffs[i] = (int) ((mulInv(p, n[i]) * 1L * p) % prod);
            }
            return coeffs;
        }

        public static int chineseRemainder(int[] n, int[] coeffs, int[] a) {

            int prod = Arrays.stream(n).reduce(1, (i, j) -> i * j);

            long sm = 0;
            for (int i = 0; i < n.length; i++) {
                int p = prod / n[i];
                sm += (a[i] * 1L * coeffs[i]);
            }
            return (int) (sm % prod);
        }

        private static int mulInv(int a, int b) {
            int b0 = b;
            int x0 = 0;
            int x1 = 1;

            if (b == 1)
                return 1;

            while (a > 1) {
                int q = a / b;
                int amb = a % b;
                a = b;
                b = amb;
                int xqx = x1 - q * x0;
                x1 = x0;
                x0 = xqx;
            }

            if (x1 < 0)
                x1 += b0;

            return x1;
        }

        public static int[] generateMinDivisors(int n) {
            int[] lp = new int[n + 1];
            lp[1] = 1;
            int[] primes = new int[n + 1];
            int cnt = 0;
            for (int i = 2; i <= n; ++i) {
                if (lp[i] == 0) {
                    lp[i] = i;
                    primes[cnt++] = i;
                }
                for (int j = 0; j < cnt && primes[j] <= lp[i] && i * primes[j] <= n; ++j) lp[i * primes[j]] = primes[j];
            }
            return lp;
        }

        public void solve(int testNumber, InputReader in, OutputWriter out) {
            int n = in.nextInt();
            int[] spf = generateMinDivisors(n);
            long ans = 0;
            for (int d = 1; d < n; d++) {
                ArrayList<Integer> primes = new ArrayList<>();
                int x = d;
                while (x > 1) {
                    int p = spf[x];
                    int pe = 1;

                    while (x % p == 0) {
                        x /= p;
                        pe *= p;
                    }
                    primes.add(pe);
                }
                int k = primes.size();
                int[] remainder = new int[k];
                int[] pe = primes.stream().mapToInt(i -> i).toArray();
                int r = n % d, t = (n - d) / d;
                ans += t * 1L * (1 << k);
                int[] coeffs = getCoeffs(pe, remainder);
                for (int i = 0; i < (1 << k); i++) {
                    for (int j = 0; j < k; j++) {
                        remainder[j] = 0;
                        if ((i >> j) % 2 == 0) remainder[j] = pe[j] - 1;
                    }
                    int v = chineseRemainder(pe, coeffs, remainder);
                    // number of values = v (mod d)
                    if (v >= 1 && v <= r) ans++;
                }
            }
            out.println(ans);
        }

    }

    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;
        private InputReader.SpaceCharFilter filter;

        public InputReader(InputStream stream) {
            this.stream = stream;
        }

        public int read() {
            if (numChars == -1) {
                throw new InputMismatchException();
            }
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                } catch (IOException e) {
                    throw new InputMismatchException();
                }
                if (numChars <= 0) {
                    return -1;
                }
            }
            return buf[curChar++];
        }

        public int nextInt() {
            int c = read();
            while (isSpaceChar(c)) c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            int res = 0;
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            } while (!isSpaceChar(c));
            return res * sgn;
        }

        public boolean isSpaceChar(int c) {
            if (filter != null) {
                return filter.isSpaceChar(c);
            }
            return isWhitespace(c);
        }

        public static boolean isWhitespace(int c) {
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);

        }

    }

    static class OutputWriter {
        private final PrintWriter writer;

        public OutputWriter(OutputStream outputStream) {
            writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(outputStream)));
        }

        public OutputWriter(Writer writer) {
            this.writer = new PrintWriter(writer);
        }

        public void println(Object... objects) {
            for (int i = 0; i < objects.length; i++) {
                if (i != 0) {
                    writer.print(' ');
                }
                writer.print(objects[i]);
            }
            writer.print('\n');
        }

        public void close() {
            writer.close();
        }

    }
}

