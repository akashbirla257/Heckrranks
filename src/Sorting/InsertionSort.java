
package Sorting;
  import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class InsertionSort {
 
  

    public static void main(String[] args) {
         Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]=new int[n];
        boolean check=false;
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        int var=arr[n-1];
        for(int i=n-2;i>=-1;i--){
           if(i!=-1){
               if(var < arr[i]){
                   arr[i+1]=arr[i];
               }
               else{
                   arr[i+1]=var;
                   check=true;
               }
               
           } 
            else{
                arr[0]=var;
            }
            for(int j=0;j<n;j++)
                System.out.print(arr[j]+" ");
            System.out.println();
            if(check)
                break;
        }
        
        
    }
}


