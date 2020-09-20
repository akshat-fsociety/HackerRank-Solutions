/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t=0;
		if(sc.hasNextInt())
		t = sc.nextInt();
		while(t--!=0){
		    int n = sc.nextInt(); 
		    int s =1; 
		    for (int i = 2; i * i <= n; i++) 
            { 
                if (n % i==0) 
                { 
                    if(i * i != n) 
                        s = s + i + n / i; 
                    else
                        s = s + i; 
                } 
            }  
            if (s == n && n != 1) System.out.println("YES");
            else {
                System.out.println("NO");
            }
		}
	}
}
