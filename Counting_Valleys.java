import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countingValleys function below.
    
       
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] hike = scan.next().toCharArray();
        
        int count = 0;
        int altitude = 0;
        
        for(char c : hike) {
            // Step up
            if(c == 'U') {
                if(altitude == -1) {
                    count++;
                }
                altitude++;
            }
            // Step down
            else {
                altitude--;
            }
        }

        scan.close();
        
        System.out.println(count);
    }
}
