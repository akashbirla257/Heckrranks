
package String;

import java.util.Scanner;
class Roman{
    void roman(int n){
        String str=n+"";
        int i;
        StringBuilder sb=new StringBuilder();
        String rom[][]=new String[][]{
           {"", "I","II","III","IV","V","VI","VII","VIII","IX","X"},
{"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
{"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"},
{"", "M", "MM", "MMM", "MMMM"} 
        };
        for(i=0;i<str.length();i++)
            sb.append(rom[str.length()-i-1][Character.getNumericValue(str.charAt(i))]);
        System.out.println(sb+" ");
    }
}
public class RomanNumber {
    public static void main(String args[]){
       Scanner sc=new Scanner(System.in); 
       int t=sc.nextInt();
       Roman r=new Roman();
       while(t-->0){
           int n=sc.nextInt();
           r.roman(n);
       }
    }
}
