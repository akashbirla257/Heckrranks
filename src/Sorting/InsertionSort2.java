
package Sorting;

import java.util.Scanner;

public class InsertionSort2 {
     public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
        int s=scan.nextInt();
        int ar[]=new int[s];
      //  boolean check=false;
        for(int i=0;i<s;i++)
        {
            ar[i]=scan.nextInt();
        }
        for(int i=1;i<s;i++){
            int temp=ar[i];
         int j=i-1;
         while(j>=0 && ar[j]>temp){
             ar[j+1]=ar[j];
             ar[j]=temp;
             j--;
         }
            for( j=0;j<s;j++)
                System.out.print(ar[j]+" ");
            System.out.println();
        }
}
}