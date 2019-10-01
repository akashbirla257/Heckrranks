
package heckrranks;
  import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class EqualizArray {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] counts = new int[101];
        for (int i = 0; i < n; i++) {
            counts[sc.nextInt()]++;
        }
        Arrays.sort(counts);
        System.out.println(n-counts[100]);
    }

}
