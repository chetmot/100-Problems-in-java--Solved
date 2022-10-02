//Question 27:
import java.util.*;

public class Unique_Character {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=0, check=0;
        String str= sc.nextLine();
        for(int i=0; i<str.length(); i++) {
            count=0;
            for(int j=0; j<str.length(); j++){
                if(str.charAt(i)==str.charAt(j)) count++;
            }
            if(count==1){
                System.out.println(i);
                check=1;
                break;
            }
        }
        if(check==0) System.out.println("-1");
    }
}