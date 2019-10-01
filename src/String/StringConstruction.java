/*
Amanda has a string of lowercase letters that she wants to copy to a new string. She can perform the following operations with the given costs. She can perform them any number of times to construct a new string :

    Append a character to the end of string at a cost of dollar.
    Choose any substring of and append it to the end of at no charge.

Given strings , find and print the minimum cost of copying each to on a new line.

For example, given a string , it can be copied for dollars. Start by copying , and individually at a cost of dollar per character. String at this time. Copy to the end of at no cost to complete the copy. 
*/
package String;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StringConstruction {
    static int StringConstruction(String s){
        Set<Character>uniquue=new HashSet<>();
        for(char c:s.toCharArray()){
            uniquue.add(c);
        }
        return uniquue.size();
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int q=sc.nextInt();
        while(q-- >0){
            String s=sc.next();
            int result=StringConstruction(s);
            System.out.println(result);
        }
        
        
    }
}
/*
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            String s = in.next();
            
            Set<Character> uniqueChars = new HashSet<>();
            for(char c : s.toCharArray())
            {
                uniqueChars.add(c);
            }
            System.out.println(uniqueChars.size());
        }
    }
}
*/