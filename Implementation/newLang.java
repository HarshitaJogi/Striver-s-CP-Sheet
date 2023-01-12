import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class newLang{

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
        for(int i=0; i<t; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();

            int cnt = 0;
            while(a<=n || b<=n){
                if(a<b){
                   a+=b;
                   //System.out.println("a = " + a);
                   cnt++;
                   //System.out.println(cnt);
                }
                else if(b<a){
                   b+=a;
                   //System.out.println("b = " + b);
                   cnt++;
                   //System.out.println(cnt); 
                }
                if(a>n || b>n) break;
                
            }

            System.out.println(cnt);
        }
		
        

	}
}