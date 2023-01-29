import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Floor_Numbers{

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
        for(int z=0; z<t; z++){
            int n = sc.nextInt();
            int x = sc.nextInt();

            int ans = 1;
            if(n==1 || n==2){
                ans = 1;
            }

            // else{
            //     int low=3;
            //     int high=x+2;
            //     // System.out.println(low);
            //     // System.out.println(high);
            //     boolean cont = true;
            //     while(cont){
            //         //System.out.println("low is " + low);
            //         //System.out.println("high is " + high);
            //         ans++;
            //         if(n>= low && n<=high){
            //             cont = false;
            //             break;
            //         }
    
            //         low = high + 1;
            //         high = low + x-1;

            //     }
            // }

            else{
                ans = (int)Math.floor((n-3)/x) + 2;
            }
        

            System.out.println(ans);

        }


	}
}