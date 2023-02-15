import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class three_pairwaise_maximums{

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
        for(long h=0l; h<t; h++){
            long x = sc.nextLong();
            long y = sc.nextLong();
            long z = sc.nextLong();

            long a = -1;
            long b = -1; 
            long c = -1;

            a = x;

            if(y > x){
                c = y;

                if(z > y){
                    b = z;
                }
                else if(z == y){
                    b = y-1;
                }
            }

            else if(y == x){
                c = x-1;

                if(z > x-1){
                    b = z;
                }
                else if(z == x-1){
                    b = x-2;
                }
            }

            if(a == -1 || b == -1 || c == -1){
                System.out.println("No");
            }
            else{
                System.out.println("Yes");
                System.out.println(a + " " + b + " " + c);
            }
        }


	}
}