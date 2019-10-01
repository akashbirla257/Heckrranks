/*
Letters in some of the SOS messages are altered by cosmic radiation during transmission. Given the signal received by Earth as a string, , determine how many letters of Sami's SOS have been changed by radiation.

For example, Earth receives SOSTOT. Sami's original message was SOSSOS. Two of the message characters were changed in transit. 
*/
// mass Exploratio0n
package String;
  import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarseExploration {
  

    public static void main(String[] args)  {
      Scanner scanner = new Scanner(System.in);
     String recivedString=scanner.next();
     int count=0;
        for(int i=0;i<recivedString.length();i+=3){
            if(recivedString.charAt(i)!='S'){
                count+=1;
            }
              if(recivedString.charAt(i+1)!='O'){
                count+=1;
            }
             if(recivedString.charAt(i+2)!='S'){
                count+=1;
            }
           /*  else if((recivedString.charAt(i)=='S') && (recivedString.charAt(i+1)=='O' ) && (recivedString.charAt(i+1)=='S')){
    
                System.out.println(0);
            }*/
        
        }
    System.out.println(count);
    } 
}


