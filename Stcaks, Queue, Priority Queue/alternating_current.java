import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class alternating_current{

	static class FastReader {
        BufferedReader br;
        StringTokenizer st;

  
        public FastReader()
        {
            br = new BufferedReader(
                new InputStreamReader(System.in));
        }
  
        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
  
        int nextInt() { return Integer.parseInt(next()); }
  
        long nextLong() { return Long.parseLong(next()); }
  
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
  
        String nextLine()
        {
            String str = " ";
            StringTokenizer st = new StringTokenizer(str);
            try {
                if(st.hasMoreTokens()){
                    str  = st.nextToken("\n");
                }
                else{
                    str = br.readLine();
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

	public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		FastReader sc = new FastReader();
        //Scanner sc = new Scanner(System.in);
		
        String s = sc.nextLine();

        // int no_minus = 0;
        // int no_plus = 0;

        // for(int i=0; i<s.length(); i++){
        //     if(s.charAt(i) == '-') no_minus++;
        //     else no_plus++;
        // }
        // String ans = "NO";
        // if(no_minus == no_plus) ans = "YES";
        // else if(no_minus%2==0 && no_plus==0) ans = "YES";
        // else if(no_plus%2==0 && no_minus==0) ans = "YES";
        // System.out.println(ans);


        String ans = "NO";

        Stack<Character> stack = new Stack<Character>();

        for(int i=0; i<s.length(); i++){

            boolean empty = stack.empty();
            if(empty == true){
                stack.push(s.charAt(i));
            }

            else{
                if(s.charAt(i) == stack.peek()){
                    stack.pop();
                }
                else{
                    stack.push(s.charAt(i));
                }
            }
           
           
        }

        
        boolean isEmmpty = stack.empty();
        if(isEmmpty == true) ans = "YES";
        else ans = "NO";

        System.out.println(ans);





	}
}
