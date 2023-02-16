import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class even_array{

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

            int n = sc.nextInt();
            int [] arr = new int [n];

            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int cnt_even = 0;
            int cnt_odd = 0;
            int ans = 0;

            for(int i=0; i<n; i++){
                if((arr[i] & 1) == 0){
                    cnt_even++;
                }
                else cnt_odd++;
            }

            if(cnt_even != ((n+1)/2) && cnt_odd != (n/2)){
                ans = -1;
            } 
            else{
                int wrong = 0;

                for(int i=0; i<n; i++){
                    if(((i ^ arr[i]) & 1) != 0) wrong++;
                }

                ans = wrong/2;
            }

            System.out.println(ans);



        }


	}
}