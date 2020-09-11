import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static long repeatedString(String s, long n) {
        int i,l; long c=0; char ch; long total=0;
        l= s.length();
        for(i = 0; i<l; i++){
            ch = s.charAt(i);
            if(ch=='a'){
                c++;
            }
        }
        long divisor = n / s.length();
        
        total += divisor * c;
        for(int j=0; j< n%l; j++){
             ch = s.charAt(j);
            if(ch=='a'){
                total++;
            }
        }return total;
    }
    
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
