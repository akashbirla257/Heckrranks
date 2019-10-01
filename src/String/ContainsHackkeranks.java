
package String;

import java.util.Scanner;


public class ContainsHackkeranks {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while(q-- >0){
            String str=scan.next();
              System.out.println(subsequenceExists(str) ? "YES" : "NO");
            
        }
    }

    private static boolean subsequenceExists(String str) {
        //To change body of generated methods, choose Tools | Templates.
     String hackerrank = "hackerrank";
        int index = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==hackerrank.charAt(index)){
                index++;
                
            }
           if (index == hackerrank.length()) {
                return true;
        }
        }
          return false;
    
    }
}

