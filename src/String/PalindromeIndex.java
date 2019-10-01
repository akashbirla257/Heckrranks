
package String;

import java.util.Scanner;

public class PalindromeIndex {
    static boolean isPalindrom(String s,int start,int end){
        for(int i=start,j=end;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
        }
        return true;
    }
    static int Palidrom(String s){
        for(int i=0,j=s.length()-1;i<j;i++,j--){
            if(s.charAt(i)!=s.charAt(j)){
                return isPalindrom(s,i+1,j) ? i:j;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        while(q-- >0){
            String str=s.next();
            int result= Palidrom(str);
            System.out.println(result);
        }
    }
}
