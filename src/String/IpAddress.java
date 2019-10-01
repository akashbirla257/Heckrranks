
package String;

import java.util.ArrayList;
import java.util.Scanner;
class Solution {
		public boolean isValidIP(String s){
	    int flag=1;
	   String arr[]=s.split("\\.");
	   //System.out.println(arr.length);
	   int count = 0;
        for(int i=0; i < s.length(); i++)
        {
            if(s.charAt(i) == '.')
                count++;
        }
       
        if(count!=3)
            return false;
        if(arr.length!=4)
            return false;

	   for(int i=0;i<arr.length;i++)
	   {
	       if(arr[i].length()>3)
	            return false;
	       try{
	           int x=Integer.parseInt(arr[i]);
	            if(x<0 || x>255)
	                return false;
	            if(x==0 && arr[i].length()>1)
	                return false;
	           if(x>0 && arr[i].charAt(0)=='0')
	                return false;
	       }
	       catch(Exception e)
	       {
	           return false;
	       }
	   }
	   return true;
	}
}

public class IpAddress {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       Solution obj=new Solution();
        while(t-->0){
            String Ip=sc.next();
          
            if(obj.isValidIP(Ip))
                System.out.println("1");
             else
                System.out.println("0");
            
        }
    }
}
