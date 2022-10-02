//Question 40:
import java.util.*;

public class Nice_Swaps {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double m = (Math.sqrt(2*n*n+2*n+1) - 1)/2;
        if(n<3) System.out.print("0");
        else {
            System.out.print(String.format("%.0f", Math.floor(n-m+1)));
        }
        
        
    }
}
