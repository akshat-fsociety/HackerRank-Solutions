//Solution by Akshat Srivastava

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int la,lb,s=0,i; char p,p1; String s1,s2;
        la=A.length();
        lb=B.length();
        s+=la+lb;
        System.out.println(s);
        if(A.compareTo(B)>=1)
        System.out.println("Yes");
        else if(A.compareTo(B)<=0) 
        System.out.println("No");
        A=A.substring(0,1).toUpperCase()+A.substring(1).toLowerCase();
        B=B.substring(0,1).toUpperCase()+B.substring(1).toLowerCase();
        System.out.println(A+" "+B);
    }
}
