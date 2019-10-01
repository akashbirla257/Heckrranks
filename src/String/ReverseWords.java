
package String;

import java.util.Scanner;


public class ReverseWords {
    String revString(String word){
        String words[]=word.split("\\.");
        int len=words.length;
        String rev="";
        for(int i=len-1;i>=0;i--){
            if(i==len)
                rev=rev+words[i]+".";
            else if(i==0)
                rev=rev+words[i];
            else
                rev=rev+words[i]+".";
        }
        return rev;
    }
    public static void main(String args[]){
       		Scanner sc=new Scanner(System.in);
	 int t=sc.nextInt();
         while(t-->0){
	 
	 String a=sc.next();
	     ReverseWords g1=new ReverseWords();
	     System.out.println(g1.revString(a));
	 }
    }
}
