/*Sample Input

5 4
1 2 3 4 5
Sample Output

5 1 2 3 4 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n,d,i;
    n = sc.nextInt();
    d = sc.nextInt();
    int a[] = new int[n];
    for(i=0;i<n;i++){
        a[i] = sc.nextInt();
    }
    for(int j=d;j<n;j++){
        System.out.print(a[j]+" ");
    }
     for(int t=0;t<d;t++){
        System.out.print(a[t]+" ");
    }
    }
}
