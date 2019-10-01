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

public class RepintingString2 {
  


    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        long countForSubstring = 0;
        long totalCount = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'){
                countForSubstring++;
            }
        }
        long divisior= n / s.length() ;
         totalCount +=divisior * countForSubstring;
         
         long remainder = n % s.length();
         for(int i=0;i<remainder;i++){
               if(s.charAt(i) == 'a')
            {
                totalCount++;
            }
         }
        return totalCount ;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

