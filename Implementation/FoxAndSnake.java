import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class FoxAndSnake{

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
        int m = sc.nextInt();
        boolean t = true;

        for(int i=0; i<n; i++){
            if(i%2==0){
                System.out.println("#".repeat(m));
            }
            // else{
            //     for(int j=i; j<n; j++){
            //         if(j== ((4*i)-3)){
            //             System.out.print(".".repeat(m-1));
            //             System.out.println("#");
            //         }
            //         else{
            //             System.out.print("#");
            //             System.out.println(".".repeat(m-1));
            //         }
            //     }
            // }

            else{
                
                if(t == true){
                    System.out.print(".".repeat(m-1));
                    System.out.println("#");
                }
                else{
                        System.out.print("#");
                        System.out.println(".".repeat(m-1));
                }
                t = !t;

            }
        }


	}
}