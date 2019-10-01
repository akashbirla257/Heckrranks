
package String;

import java.util.*;
import java.lang.*;
import java.io.*;
/*
Given two string str1 and str2(of lower case alphabets) of same length. Find the longest prefix of str1 which is common in str2 as well. Print the index at which the longest common prefix of str1 is found in str2 and the longest common prefix with spaces in between.

NOTE: If there is no common prefix then print "-1".
*/
/*
INPUT:
2
geeks
dgeek
practicegeeks
coderpractice

OUTPUT:
1 geek
5 practice
*/
public class PermutationString {
    /*package whatever //do not write package name here */
    
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
		    String s1=sc.next();
		    String s2=sc.next();
		    
		    int i=0,j=0;
		    int start=0;
		    int ans=Integer.MIN_VALUE;
		    int len=0;
		    while(i<s1.length() && j<s2.length()){
		        if(s2.charAt(j)==s1.charAt(i)){
		            len++;
		            if(len>ans){
		                ans=len;
		                start=j-len+1;
		            }
		            i++;
		            j++;
		        }
		        else if((s2.charAt(j)!=s1.charAt(i)) && len!=0){
		            len=0;
		            i=0;
		            j++;
		        }
		        else{
		            j++;
		        }
		        
		    }
		            if(start == 0)
		               System.out.print("-1");
		            else{
		                System.out.print(start+" ");
		                for(int k=start;k<(start+ans);k++)
		                    System.out.print(s2.charAt(k));
		            }
		            
            System.out.println();
        
		}
	}
}

