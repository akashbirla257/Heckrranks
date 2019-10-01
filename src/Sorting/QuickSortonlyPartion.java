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
public class QuickSortonlyPartion {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int pivot = input.nextInt();
        StringBuilder greater = new StringBuilder("");
        for(int i = 1; i < n; i++){
            int num = input.nextInt();
            if(num < pivot)
            {
                System.out.print(num+" ");
                continue;
            }
            else
                greater.append(num+" ");
                
        }
        System.out.print(pivot+" "+greater.toString());        
    }
}
