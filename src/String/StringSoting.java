
package String;

import java.util.Scanner;

public class StringSoting {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            System.out.println("How many String Print");
        int n=sc.nextInt();   
        String str[]=new String[n];
         int i;
         System.out.println("Before Sorting String are ");
       for(i=0;i<n;i++){
           str[i]=sc.next();
       }
        String temp=null;
        int j;
        for(i=0;i<n;i++){
            for(j=i+1;j<n;j++){
                if(str[i].compareTo(str[j])>0){
                    temp=str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
           
        }
       for(i=0;i<n;i++){
           System.out.println(str[i]+" ");
       }
        
        }
}
}