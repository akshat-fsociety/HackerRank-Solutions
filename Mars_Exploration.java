//Solution by Akshat Srivastava

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    static int marsExploration(String s) {
        int i,l,c=0;
        s=s.toUpperCase();
        l=s.length();
        for(i=0; i<l; i+=3){
            char p = s.charAt(i);
            char q = s.charAt(i+1);
            char r = s.charAt(i+2);
            if(p!='S'){c++;}
            if(q!='O'){c++;}
            if(r!='S'){c++;}
        }
        return c;    
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        int result = marsExploration(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
