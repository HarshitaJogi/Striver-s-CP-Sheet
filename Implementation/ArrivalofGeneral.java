import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ArrivalofGeneral{

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
		
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int cnt_min = 0;
        for(int i=0; i<n; i++){
            if(arr[i]<=min){
                min = arr[i];
                cnt_min = i;
            }
        }

        int max = 0;
        int cnt_max = 0;
        for(int i=n-1; i>=0; i--){
            if(arr[i]>=max){
                max = arr[i];
                cnt_max = i;
            }
        }

        // System.out.println(max);
        // System.out.println(min);
        // System.out.println(cnt_max);
        // System.out.println(cnt_min);

        int ans=0;
        if(cnt_max<=cnt_min){
            ans = cnt_max-0 + n-1 - cnt_min;
        }
        else{
            ans = cnt_max-0 + n-1 - cnt_min-1;
        }

        System.out.println(ans);

	}
}