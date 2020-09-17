/*https://www.hackerrank.com/challenges/java-negative-subarray/problem*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n= sc.nextInt();
        int c=0;
        int [] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        for(int j=0; j<n; j++){
            int sum=0;
            for(int x=j; x<n; x++){
                sum += a[x];
                if(sum<0){
                    c++;
                }
            }
        }
        System.out.print(c);

    }
}
