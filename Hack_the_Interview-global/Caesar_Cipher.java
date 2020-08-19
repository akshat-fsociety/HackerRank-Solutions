import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String caesarCipher(String s, int k) {
        int i,l;
        String str = "";
        char c;
        l=s.length();
     
        for(i=0;i<l;i++){
            c = s.charAt(i);
            if(c>='a' && c<='z'){
               str+= ((char)(((int)c - (int)'a' + k) % 26 + (int)'a'));
            }
            else if(c>='A' && c<='Z'){
               str+=((char)(((int)c - (int)'A' + k) % 26 + (int)'A'));
            }
            else{
                str+=c;
            }
        }
        return(str);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = caesarCipher(s, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
