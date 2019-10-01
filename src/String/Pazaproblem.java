
package String;

import java.util.Scanner;

public class Pazaproblem {
    public static void main(String rgs[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int size=sc.nextInt();
            int q=sc.nextInt();
            int start=0;
            String str=sc.next();
            char arr[]=str.toCharArray();
            for(int i=0;i<q;i++){
                int k=sc.nextInt();
                int L=sc.nextInt();
                if(k==1){
                    L=L%size;
                    start=(start+(size-k))%size;
                    
                }
                else{
                 System.out.println(arr[(start + L) % size]);
            }
            }
        }
    }
}
