
package String;
  import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class SEperateNumber {
  
 
    static long separateNumbers(String s) {
        if (s.charAt(0) == '0') {
            return -1;
        }

        for (int length = 1; length * 2 <= s.length(); length++) {
            long firstNumber = Long.parseLong(s.substring(0, length));

            StringBuilder sequence = new StringBuilder();
            long number = firstNumber;
            while (sequence.length() < s.length()) {
                sequence.append(number);
                number++;
            }
            if (sequence.toString().equals(s)) {
                return firstNumber;
            }
        }
        return -1;
    }
   
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();
        for (int tc = 0; tc < q; tc++) {
            String s = sc.next();

            long result = separateNumbers(s);
            System.out.println(result > 0 ? "YES " + result : "NO");
        }

        sc.close();
    }
}


