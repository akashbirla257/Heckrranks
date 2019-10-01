
package String;

import java.util.Scanner;

public class AnagramRemove {
    static int numberNeeded(String s1,String s2){
    int deletion=0;
      int firstcount[]=new int[26];
        int Secondcount[]=new int[26];
        for(int i=0;i<s1.length();i++){
            firstcount[s1.charAt(i)-'a']=firstcount[s1.charAt(i)-'a']+1;
        }
        for(int i=0;i<s2.length();i++){
            Secondcount[s2.charAt(i)-'a']=Secondcount[s2.charAt(i)-'a']+1;
        }
        for(int i=0;i<26;i++){
            deletion+=Math.abs(firstcount[i]-Secondcount[i]);
        }
      return deletion;

    }

     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
