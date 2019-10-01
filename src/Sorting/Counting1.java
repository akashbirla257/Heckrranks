
package Sorting;

import java.util.Scanner;

public class Counting1 {
     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] Range = new int[100];
        for(int i=0;i<n;i++){
            int num=input.nextInt();
            Range[num]=Range[num]+1;
        }
        for(int i=0;i<Range.length;i++){
             System.out.print(Range[i]+" ");
        }
        
        
}
}