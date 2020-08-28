/*given a range [low,high] (both inclusive) , select k number from range (a number can be chosen multiple times ) 
such that sum those k numbers is even calculate the number of all such permutations As this number can be large*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// --------------Approach-----------------
// Permutation and combination implementation

public class Solution {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int i,low,high,n,c = 0,t,r;  //init for the code.
        low = sc.nextInt();          //Taking low value from user.           
        high = sc.nextInt();         //Taking high value from user.
        n = sc.nextInt();            //Taking N value from user.
        for(i=low; i<=high; i++){    //looping from low val to high val
            if(i%2==0){              //checking for even val.
                c++;                 //counter to count with init of 0
            }
        }
        t = high-low+1;              //ranging (5-4+1)=2
        r = (int)Math.pow(t,n-1)*c;  //Calculating the number of combinations.
        System.out.print(r);
   
    }
}
