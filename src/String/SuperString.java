//reducing String
package String;
   import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SuperString {
  

    // Complete the superReducedString function below.
    static String superReducedString(String s) {
        StringBuilder str=new StringBuilder(s);
        boolean flage=true;
        while(flage){
                 flage=false;
            for(int i=0;i<str.length()-1;i++)
            {
                if(str.charAt(i)==str.charAt(i+1)){
                    str.delete(i,i+2);
                flage=true;
            }
        }
        }
        if(str.length()==0){
            return "Empty String";
        }
        else{
            System.out.print( str.toString());
        }
        return str.toString();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = superReducedString(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}


