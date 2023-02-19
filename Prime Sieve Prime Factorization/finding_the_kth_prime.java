import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class finding_the_kth_prime{

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

	static int N = 100000000+10;
    static ArrayList<Integer> primes = new ArrayList<Integer>();
    static boolean [] sieve = new boolean [N];

    public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		FastReader sc = new FastReader();
		
            Arrays.fill(sieve, true);

            sieve[1] = false;
            primes.add(2);


            for(int i=3; i*i<=N; i+=2){
                if(sieve[i]==true){
                    //primes.add(i);
                    for(int j=i*i, k=i<<1; j<=N; j+=k){
                        sieve[j]=false;
                    }
                }
            }

            for(int i=3; i<N; i++){
                if(sieve[i]==true && i%2!=0) primes.add(i);
                    //System.out.println(i);
            }

            // System.out.println(primes.size());

            // for(int i=0; i<=primes.size(); i+=100){
            //     System.out.println(primes.get(i));
            // }

            int t = sc.nextInt();
            for(int i=0; i<t; i++){
                int k = sc.nextInt();

                System.out.println(primes.get(k-1));
            }

            
        

	}
}