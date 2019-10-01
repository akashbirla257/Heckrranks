
package Sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class SortStringsComparator implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
      
    if(s1.length()==s2.length()){
       return s1.compareTo(s2);
   }
    return s1.length()-s2.length();
    }
    
}
public class BigSorting {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        StringBuilder out =new StringBuilder();
        int n=s.nextInt();
        String unsorted[]=new String[n];
        for(int i=0;i<n;i++){
            unsorted[i]=s.next();
        }
        Arrays.sort(unsorted,new SortStringsComparator());
        for(int i=0;i<unsorted.length;i++){
            out.append(unsorted[i].toString()+"\n");
        }
        System.out.println(out);
    }
}
