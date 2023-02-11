import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class lcm{

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
        for(int a=0; a<t; a++){
            long l = sc.nextLong();
            long r = sc.nextLong();

            long x = -1;
            long y = -1;

            // for lcm
            // long lcm = 0l;
            // long gcd = 1;
            // for(long i = 1; i <= l && i <= r; i++)   
            // {   
            //     if(l % i == 0 && r % i == 0)    
            //         gcd = i;  
            // }   
            // lcm = (l * r) / gcd;  


            // if(l<= lcm && r>= lcm){
            //     x = l;
            //     y = r;
            // }

            // System.out.println(x + " " + y);

            if(2*l <= r){
                x = l;
                y = 2*l;
            }

            System.out.println(x + " " + y);


        }


	}
}