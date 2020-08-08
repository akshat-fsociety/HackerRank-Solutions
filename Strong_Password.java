import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int minimumNumber(int n, String password) {
    
         int c=0;
          boolean lower=false,capital=false,number=false,special=false;
          boolean count[]= {lower,capital,number,special};
          for(int i=0;i<password.length();i++) {
           if(count[0]!=true) 
            count[0] =Character.isLowerCase(password.charAt(i));
            if(count[1]!=true)
            count[1]=Character.isUpperCase(password.charAt(i));
            if(count[2]!=true)
            count[2]=Character.isDigit(password.charAt(i));
            if(count[3]!=true)
            count[3]=SpecialCharacter(password.charAt(i));
        }
             for(int i=0;i<count.length;i++) {
           if(count[i]==false) {
            c++;
              } 
          } 
         if(c+password.length()>6)
           return c;
          else return ((6-password.length()));
              }
    public static boolean SpecialCharacter(char q) {
      if((q=='!')||(q=='@')||(q=='#')||(q=='$')||(q=='%')||(q=='^')||(q=='&')||(q=='*')||(q=='(')||(q==')')||(q=='-')||(q=='+'))
      return true;
     else return false;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();

        int answer = minimumNumber(n, password);

        bufferedWriter.write(String.valueOf(answer));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
