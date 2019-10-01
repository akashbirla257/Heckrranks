
package String;
import java.io.IOException;
import java.math.*;
import java.util.*;
public class Funnytring {
    static String funnyString(String str){
        String rev=(new StringBuffer(str)).reverse().toString();
        for(int i=1;i<str.length();i++){
             if (Math.abs(((int)str.charAt(i)) - ((int)str.charAt(i-1))) != Math.abs(((int)rev.charAt(i)) - ((int)rev.charAt(i-1))))
            {
            return "Not Funny";
        }
        }
        return "Funny";
    }
     public static void main(String[] args) throws IOException {
         Scanner scn=new Scanner(System.in);
         int n=scn.nextInt();
         while(n-- >0){
             String str=scn.nextLine();
             String result=funnyString(str);
         }
     }
}
