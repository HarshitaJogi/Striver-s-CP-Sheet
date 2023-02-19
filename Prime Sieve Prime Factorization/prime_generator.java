import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class prime_generator{

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

	static int N = 1000000000;
    static boolean [] sieve = new boolean[(int)N];

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

            Arrays.fill(sieve, true);

            long m = sc.nextLong();
            long n = sc.nextLong();

            sieve[1] = false;

            for(long i=2; i<N; i++){
                if(sieve[(int)i] == true){
                    for(long j=2*i; j<N; j+=i){
                        sieve[(int)j] = false;
                    }
                }
            }

            for(long i=m; i<=n; i++){
                if(sieve[(int)i]==true) System.out.println(i);
            }

            System.out.println();
        }

	}
}