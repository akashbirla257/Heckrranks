
package heckrranks;

import java.util.Scanner;

public class Choclate {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("No of Test case");
        int t=s.nextInt();
        for(int i=0;i<t;i++){
            System.out.println("Mone spend ");
            int N=s.nextInt();
            System.out.println("Enter the cost");
            int c=s.nextInt();
            System.out.println("How many wraper");
            int m=s.nextInt();
            
            int ate =0;
            int choclate=N/c;
            ate+=choclate;
            while(choclate>=m){
                ate+=choclate/m;
                choclate=(choclate / m)+(choclate % m);
            }
            System.out.println(ate);
        }
    }
}
