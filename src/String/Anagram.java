
package String;

import java.util.Scanner;

public class Anagram {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
         System.out.println("Enter how may test cases");
        int q=s.nextInt();
        while(q-- >0){
             System.out.println("Enter the String");
            String str=s.next();
            if(str.length()%2==1){
                System.out.println(-1);
            }
            else{
                String str1=str.substring(0, str.length()/2);
                String str2=str.substring( str.length()/2,str.length());
                int[] count = new int[26];
                for(int i=0;i<str1.length();i++){
                    count[str1.charAt(i)-'a']++;
                }
                int change=0;
                for(int i=0;i<str2.length();i++){
                    if(count[str2.charAt(i)-'a']>0){
                        count[str2.charAt(i)-'a']--;
                    }
                    else{
                        change++;
                    }
                }
                //change to convert for anagramString
                  System.out.println(change);
            }
        }
        
    }
}
