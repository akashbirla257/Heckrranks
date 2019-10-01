/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Counting2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] Ranges = new int[100];
        for(int i = 0; i < n; i++)
        {
            int num = input.nextInt();
            Ranges[num] = Ranges[num] + 1;
        }
        
        for(int i = 0; i < Ranges.length; i++)
        {
            for(int j = 0; j < Ranges[i]; j++)
            {
                System.out.print(i+" ");    
            }
        }
    }

}
