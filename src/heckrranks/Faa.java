/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heckrranks;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Faa {
     public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    int B[] = new int[N];
    int sum = 0;
    for(int B_i=0; B_i < N; B_i++){
        B[B_i] = in.nextInt();
        sum+=B[B_i];
         System.out.println(sum);
    }
   
}
}