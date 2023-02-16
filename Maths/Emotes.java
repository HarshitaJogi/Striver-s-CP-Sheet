import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Emotes{

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
        long m = sc.nextLong();
        long k = sc.nextLong();

        long [] arr = new long[(int)n];

        for(int i=0; i<n; i++){
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);

        long largest = arr[(int)n-1];
        //System.out.println(largest);
        long sec_lar = arr[(int)n-2];
        //System.out.println(sec_lar);

        long x = m/(k+1);
        // System.out.println(sec_lar*x);
        //  System.out.println(sec_lar*x);

        long ans = (sec_lar*x) + ((m-x)*largest);

        System.out.println(ans);


	}
}