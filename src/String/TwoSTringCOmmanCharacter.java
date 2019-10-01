/*
Given two strings, determine if they share a common substring. A substring may be as small as one character.

For example, the words "a", "and", "art" share the common substring . The words "be" and "cat" do not share a substring. 
*/
package String;
   import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoSTringCOmmanCharacter {
 

    // Complete the twoStrings function below.
    static String twoStrings(String s1, String s2) {
        Set<Character>a=new HashSet<Character>();
         Set<Character>b=new HashSet<Character>();
        for(char c1:s1.toCharArray()){
            a.add(c1);
        }
         for(char c2:s2.toCharArray()){
            b.add(c2);   
        }
        // store the set intersection in set 'a'
        a.retainAll(b);
        return (a.isEmpty())?"NO":"YES";
    }
  
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s1 = scanner.nextLine();

            String s2 = scanner.nextLine();

            String result = twoStrings(s1, s2);

            bufferedWriter.write(result);

        bufferedWriter.close();
            bufferedWriter.newLine();
        }

        scanner.close();
    }
}


