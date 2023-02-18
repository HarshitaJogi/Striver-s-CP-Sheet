import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class road_to_zero{

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
		
        int t = sc.nextInt();
        for(int h=0; h<t; h++){

            long x = sc.nextLong();
            if(x<0) x=-x;
            long y = sc.nextLong();
            if(y<0) y=-y;

            long a = sc.nextLong();
            long b = sc.nextLong();


            long cost = 0l;

            if(x == y && x == 0) cost = 0l;
            
            else{
                long diff = Math.abs(x-y);
                long cost1 = diff*a;
                long small = Math.min(x,y);
                cost1 = cost1 + small*b;

                // long small = Math.min(x,y);
                // long cost1 = small*b;
                // long big = Math.max(x,y);
                // long left = big - small;
                // cost1 = cost1 + left*a;

                long cost2 = (x+y)*a;

                cost = Math.min(cost1, cost2);

            }
            System.out.println(cost);
            
        }


	}
}