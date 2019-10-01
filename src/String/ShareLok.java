//Sherlock and the Valid String

/*
Sherlock considers a string to be valid if all characters of the string appear the same number of times. It is also valid if he can remove just character at index in the string, and the remaining characters will occur the same number of times. Given a string , determine if it is valid. If so, return YES, otherwise return NO.

For example, if , it is a valid string because frequencies are . So is because we can remove one and have of each character in the remaining string. If however, the string is not valid as we can only remove occurrence of . That would leave character frequencies of . 
*/
package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ShareLok {
     static String isValid(String s) {
    HashMap<Character, Integer> count_char = new HashMap<Character, Integer>();
        int del_count = 0;
        String result = "YES";

        for(int i = 0; i < s.length(); i++){
            if(count_char.containsKey(s.charAt(i))){
                count_char.put(s.charAt(i), count_char.get(s.charAt(i)) +1 );
            }else{
                count_char.put(s.charAt(i), 1);        
            }
        }
        int current = 0;
        for (Map.Entry<Character, Integer> count : count_char.entrySet()){
            if(current == 0){
                current = count.getValue();
            }else{
                int diff = Math.abs(current - count.getValue());
                if(count.getValue() > 1 && diff > 0){
                    del_count += diff;
                }else if(count.getValue() == 1 && diff > 0){
                    del_count++;
                }
            }
        }
        if(del_count > 1){
            result = "NO";
        }
        return result;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = isValid(s);
        System.out.println(result);
    }
}
