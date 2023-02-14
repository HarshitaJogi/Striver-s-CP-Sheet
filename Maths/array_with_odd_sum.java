import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class array_with_odd_sum{

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

            int n = sc.nextInt();
            int [] arr = new int[n];
            for(int i=0; i<n; i++){
                arr[i] = sc.nextInt();
            }

            int sum = 0;
            String ans = "no";
            for(int s: arr){
                sum += s;
            }
            //System.out.println(sum);

            if((sum & 1) != 0){
                ans = "yes";
            }

            else{
                int cnt_odd = 0;
                int cnt_even = 0;

                for(int i=0; i<n; i++){
                    if((arr[i] & 1) == 0){
                        cnt_even++;
                    }
                    else{
                        cnt_odd++;
                    }
                    if(cnt_odd>=1 && cnt_even>=1){
                        ans = "yes";
                        break;
                    }
                }

            }
            System.out.println(ans);

        }


	}
}