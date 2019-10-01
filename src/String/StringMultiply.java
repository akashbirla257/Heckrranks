
package String;

import java.math.BigInteger;
import java.util.Scanner;

public class StringMultiply {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        String s2=sc.next();
        BigInteger a=new BigInteger(s1);
          BigInteger b=new BigInteger(s2);
       // String s= new java.math.BigInteger(s1).multiply(new java.math.BigInteger(s2)).toString();
        String s=a.multiply(b).toString();
        System.out.println(s);
        
        
        
    }
}
