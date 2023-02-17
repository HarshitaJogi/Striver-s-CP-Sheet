import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class competitive_programmer{

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
            String x = sc.nextLine();
            long sum = 0l;
            long even = 0l;
            long zero = 0l;
            String ans = "cyan";


            ArrayList<Character> a = new ArrayList<Character>();
            for(int i=0; i<x.length(); i++){
                a.add(x.charAt(i));
            }

            for(int i=0; i<a.size(); i++){
                long digit = a.get(i) - 48;
                sum = sum + digit;
                if(digit%2 == 0) even++;
                if(digit == 0) zero++;
            }

            // while(x>0){
            //     long digit = 
            //     long digit = x%10;
            //     sum = sum + digit;
            //     if(digit%2 == 0) even++;
            //     if(digit == 0) zero++;
            //     x = x/10;

            // }


            //System.out.println("Sum: " + sum + " even: " + even + " zero: " + zero);

            if((sum%3==0) && even>=2 && zero>=1){
                ans = "red";
            }

            System.out.println(ans);
        }


	}
}