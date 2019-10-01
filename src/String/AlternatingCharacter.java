/*5
AAAA
BBBBB
ABABABAB //input
BABABA
AAABBB
*/
/*3
4 //output
0
0
4*/

package String;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class AlternatingCharacter {
    

    // Complete the alternatingCharacters function below.
    static int alternatingCharacters(String s) {
        int count=0;
       char []str=s.toCharArray();
        for(int i=0;i<str.length-1;i++){
            if(str[i]==str[i+1]){
                count++;
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String s = scanner.nextLine();

            int result = alternatingCharacters(s);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}



