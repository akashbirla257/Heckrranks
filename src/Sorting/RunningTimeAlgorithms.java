/*
Can you modify your previous Insertion Sort implementation to keep track of the number of shifts it makes while sorting? The only thing you should print is the number of shifts made by the algorithm to completely sort the array. A shift occurs when an element's position changes in the array. Do not shift an element if it is not necessary.
*/
/*
Running Time of Algorithms
The running time of an algorithm for a specific input depends on the number of operations executed. The greater the number of operations, the longer the running time of an algorithm. We usually want to know how many operations an algorithm will execute in proportion to the size of its input, which we will call .

What is the ratio of the running time of Insertion Sort to the size of the input? To answer this question, we need to examine the algorithm. 
*/
package Sorting;

import java.util.Scanner;

public class RunningTimeAlgorithms {
    static int RunningTime(int A[]){
        int shifts=0;
        for(int i=1;i<A.length;i++){
            int temp=A[i];
            int j=i-1;
            while(j>=0 && A[j]>temp){
                A[j+1]=A[j];
                j--;
            }
            A[j+1]=temp;
            shifts+=i-(j+1);
        }
        
        return shifts;
        
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        RunningTime(ar);
    }
}
