import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character>st = new Stack<>();
        int i,l;
        boolean balanced = true;
        l = s.length();
        if(l%2!=0){
            return("NO");
        }
        for(i=0; i<l; i++){
                char ch = s.charAt(i);
                if(ch=='(' || ch=='[' || ch=='{')
                {
                    st.push(ch);
                    continue;
                }
                if(st.isEmpty()){ balanced = false; break;}
            
                if(ch==')'){
                    if(st.peek()=='('){
                        st.pop();
                    }else{balanced=false; break;}
                }
                if(ch=='}'){
                    if(st.peek()=='{'){
                        st.pop();
                    }else{balanced=false; break;}
                }
                if(ch==']'){
                    if(st.peek()=='['){
                        st.pop();
                    }else{balanced=false; break;}
                }
        }
        if(!st.isEmpty()){
            balanced=false;
        }
        return(balanced==false?"NO":"YES");
        
        // if(balanced==false){                     /*
        //     return("NO");                           Used Ternary instead above
        // }else {return("YES");}                         */
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String s = scanner.nextLine();

            String result = isBalanced(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
