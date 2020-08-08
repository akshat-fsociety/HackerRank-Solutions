import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        in.nextLine();

        for (int i = 0; i < N; i++) 
        {
            String s = in.nextLine();
            char[] charArray = s.toCharArray();

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 == 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++) 
            {
                if (j % 2 != 0) 
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

        in.close();
    }
}
