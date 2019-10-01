/*
In computer science, you could prove it formally with a loop invariant, where you state that a desired property is maintained in your loop. Such a proof is broken down into the following parts:

    Initialization: It is true (in a limited sense) before the loop runs.
    Maintenance: If it's true before an iteration of a loop, it remains true before the next iteration.
    Termination: It will terminate in a useful way once it is finished.

*/
//Correctness and the Loop Invariant
package Sorting;

import java.util.Scanner;

public class InsertionSort3 {
   public static void main(String args[]){
      Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] array = new int[s];
        for (int i = 0; i < s; i++) {
            array[i] = scan.nextInt(); 
        }
        scan.close();
        insertionSort(array);
    }

    private static void insertionSort(int[] array) {
      for(int i=1;i<array.length;i++){
          int temp=array[i];
          int j=i-1;
          while(j>=0 && array[j]>temp){
              array[j+1]=array[j];
              j=j-1;
          }
          array[j+1]=temp;
      } 
        printArray(array);
        
    }
     private static void printArray(int[] array) {
        for (int num: array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
   } 

