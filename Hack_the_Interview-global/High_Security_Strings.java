//Solution by Akshat Srivastava


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {
    public static boolean check(String str){
        int j,flag=0; char p;
            for(j=0;j<str.length();j++){
                p=str.charAt(j);
                if(p>='A' && p<='Z'){
                    flag = 1;
                    break;
                }
            }
        if(flag==0){
            return(true);
        }
        else return(false);
    }

    public static int getStrength(String password, int weight_a) {
        int fixed = 97;
        int s = 0;
        boolean x;
        x = check(password);
        if(x==true){
        for(int i=0; i<password.length();i++){
            char ch = password.charAt(i);
            if(ch - fixed + weight_a<=25){
                s += ch-fixed+weight_a; 
            }else{
                s += (ch-fixed) - ((25-weight_a) + 1);
            }
        }
            
        }return (s);
        }
}


public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String password = bufferedReader.readLine();

        int weight_a = Integer.parseInt(bufferedReader.readLine().trim());

        int strength = Result.getStrength(password, weight_a);

        bufferedWriter.write(String.valueOf(strength));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
