import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class collecting_coins{

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
            String str = "";
            try {
                if(st.hasMoreTokens()){
                    str = st.nextToken("\n");
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
		
        long t = sc.nextLong();
        for(long h=0; h<t; h++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long n = sc.nextLong();

            // long sum = a+b+c+n;

            // if(sum % 3 == 0) System.out.println("YES");
            // else System.out.println("NO");

            long max = 0;
            max = Math.max(a,b);
            max = Math.max(max, c);

            long diff_a = max - a;
            long diff_b = max - b;
            long diff_c = max - c;

            long sum_of_diff = diff_a+diff_b+diff_c;

            long num = n - sum_of_diff;
            if(num<0) System.out.println("No");

            else{
                if(num%3 == 0 || num==0) System.out.println("Yes");
                else System.out.println("No");
            }

            
        }


	}
}