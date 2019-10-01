
package heckrranks;

import java.util.Scanner;

public class RepitingString {
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.println("Enter The String :  Enter The Numner Infinete ");
       String s = in.next();
        long n = in.nextLong();
        
        long countForSubstring = 0;
        long totalCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                countForSubstring++;
            }
        }
        long divisior= n / s.length() ;
         totalCount +=divisior * countForSubstring;
         
         long remainder = n % s.length();
         for(int i=0;i<remainder;i++){
               if(s.charAt(i) == 'a')
            {
                totalCount++;
            }
         }
        
        System.out.println(totalCount);
        
        
        
    }
}
