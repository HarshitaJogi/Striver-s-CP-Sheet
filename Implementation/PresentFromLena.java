import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PresentFromLena{

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
        for(int i=0; i<=n; i++){
            for(int j=0; j<2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                if(j==0){
                    System.out.print(j);
                }
                else{
                    System.out.print(" " + j);
                }
                
            }
            for(int j=i-1; j>=0; j--){
                System.out.print(" " + j);
            }
            System.out.println();
        }

        for(int i=0; i<n; i++){
            for(int j=1; j<=2*i+2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                if(j==0){
                    System.out.print(j);
                }
                else{
                    System.out.print(" " + j);
                }
            }
            for(int j=n-i-2; j>=0; j--){
                System.out.print(" " + j);
            }
            System.out.println();
        }


	}
}