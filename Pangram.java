import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String pangrams(String str) {
        boolean[] alphaList = new boolean[26];
      int index = 0;
      int flag = 1;
      for (int i = 0; i < str.length(); i++) {
         if ( str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
            index = str.charAt(i) - 'A';
         }else if( str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
            index = str.charAt(i) - 'a';
      }
      alphaList[index] = true;
   }
   for (int i = 0; i <= 25; i++) {
      if (alphaList[i] == false)
      flag = 0;
   }

        if(flag==1){
            return("pangram");
        }
        else
        return("not pangram");

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = pangrams(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
