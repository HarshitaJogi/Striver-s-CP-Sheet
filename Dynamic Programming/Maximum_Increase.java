import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Maximum_Increase{

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

	static int N = (int)1E6;
    static int [] dp = new int [N];

    public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		FastReader sc = new FastReader();
		
        Arrays.fill(dp, -1);

        int n = sc.nextInt();
        int [] arr = new int [n+10];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }


        int ans = 0;
        for(int i=0; i<n; i++){
            ans = Math.max(ans, max_inc(i, arr));
        }

        System.out.println(ans);


	}

    static int max_inc(int i, int arr[]){
        
        if(i==0) return 1;

        if(i<0) return 0;

        if(dp[i] != -1) return dp[i];


        int ans = 1;

        if(arr[i]>arr[i-1]){

                ans = max_inc(i-1, arr) + 1;
            
        }

        return dp[i] = ans;
    }
}
