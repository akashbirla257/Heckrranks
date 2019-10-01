
package String;

import java.util.Scanner;

public class AryasString {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            String str=sc.next();
            
             int k=sc.nextInt();
	     int n=sc.nextInt();
	     String x=sc.next();
             
             int count=0;
             int count1=0;
             for(int i=0;i<str.length();i++){
                 if(str.charAt(i)==x.charAt(0)){
                     count++;
                 }
             }
             int div=n/str.length();
              count=count*div;
              int rem=n%str.length();
              for(int i=0;i<rem;i++){
                  if(str.charAt(i)==x.charAt(0)){
                     count1++;
                  }
              }
              count+=count1;
              System.out.println(count+" ");
        }
    }
}
