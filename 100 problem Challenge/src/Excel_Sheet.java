//question 25:
import java.util.*;

public class Excel_Sheet {
    
    static int ConvertToNumber(String s){
        int result = 0;
        int x = s.length(); 
        for(int i= 0; i<x; ++i){
            result *=26;
            result +=s.charAt(i) - 'A' + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = sc.nextLine();
        System.out.println(ConvertToNumber(title));        
    }
}