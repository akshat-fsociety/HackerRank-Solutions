//Solution by Akshat Srivastava

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
        String t="";
        int i,l;
        l=s.length();
        smallest=s.substring(0,k);
        largest=s.substring(0,k);
        for(i=0;i<=l-k;i++){
            t=s.substring(i,k+i);
            if(smallest.compareTo(t)>0){  //Using compareTo() for the lexicographical comparison
            smallest=t;}
            if(largest.compareTo(t)<0){   //Using compareTo() for the lexicographical comparison
            largest=t;}
        }
        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
