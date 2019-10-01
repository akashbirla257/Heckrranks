
package String;
    import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOFtheorensI {

    static String gameOfThrones(String s){
        // Complete this function
        int lettercount[] = new int[26];
        for(char ch : s.toCharArray())
        {
            lettercount[ch-'a']++;
        }
        int counter = 0;
        for(int i :lettercount)     //for(int i=0;i<lettercount.length;i++)
        {
            if( i%2 == 1)
            {
                counter++;
            }
            if(counter >1)              
                break;
        }
        if(counter <=1)
        return "YES";
        else
        return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}

