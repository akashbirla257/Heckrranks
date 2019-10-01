/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heckrranks;
   import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Cllods {
 

    // Complete the jumpingOnClouds function below.
    static int jumpingOnClouds(int[] c) {
    int jump=0;
    int clouds=0;
        int N=c.length;
        while(clouds<N-1){
            clouds+=(c[clouds]==0)? 2 : 1 ;
            jump++ ;
        }
     
return jump;
    }

    
    public static void main(String[] args) throws IOException {
       
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
       // scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];

        
        for (int i = 0; i < n; i++) {
           
            c[i] =scanner.nextInt();
        }


        int result = jumpingOnClouds(c);

        System.out.println(result);

        scanner.close();
    }
}


