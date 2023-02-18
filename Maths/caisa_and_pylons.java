import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class caisa_and_pylons{

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
		
        long n = sc.nextLong();
        long [] arr = new long[(int)n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }

        long coins = arr[0];
        long health = 0;

        for(long i=0; i<n-1; i++){
            if((arr[(int)i]-arr[(int)i+1] + health) < 0){
                //coins = coins + Math.abs((health - (arr[(int)i+1]-arr[(int)i])));
                coins += Math.abs(arr[(int)i]-arr[(int)i+1] + health);
                health = 0;
            }
            else{
                health = health + (arr[(int)i]-arr[(int)i+1]);
            }
            //System.out.println("health is: " + health + " coins are: " + coins);
        }

        System.out.println(coins);


	}
}