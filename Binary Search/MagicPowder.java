import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MagicPowder{

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
        long k = sc.nextLong();
        long ans=-1;

        long [] requiredIng = new long[(int)n];
        long [] presentIng = new long[(int)n];

        for(int i=0; i<n; i++){
            requiredIng[i] = sc.nextLong();
        }
        for(int i=0; i<n; i++){
            presentIng[i] = sc.nextLong();
        }

        long low = 0l;
        long high = (long)1E15;

        while(low<=high){
            long mid = low + (high-low)/2;

            if(canBake(n, mid, requiredIng, presentIng, k)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }

        System.out.println(ans);


	}

    static boolean canBake(long n, long x, long requiredIng[], long presentIng[], long k){
        long [] magic = new long [(int)n];  //amount of magic powder needed for every ingrediant
        long sum=0;   // total amt of magic powder needed to bake x cookies

        for(int i=0; i<n; i++){
            magic[i] = Math.max(0l, (requiredIng[i]*x-presentIng[i]));
            sum += magic[i];
        }

        if(sum>k) return false;
        else return true;


    }
}