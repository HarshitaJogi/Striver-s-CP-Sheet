import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DiverseSubstring{

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
        String s = sc.nextLine();
        Boolean isdiverse = false;
        String diverse = "";

        // if(n==1){
        //     ans = "YES";
        //     System.out.println(ans);
        //     System.out.println(s);
        // }

        // else{
        //     Character check = s.charAt(0);
        //     for(int i=1; i<n; i++){
        //         if(check == s.charAt(i)){
        //             ans = "NO";
        //         }
        //         else ans = "YES";
        //     }
            
        //     if(ans == "NO"){
        //         System.out.println(ans);
        //     }
        //     else{
        //         System.out.println("YES");
        //         System.out.println();
        //     }
        // }

        for(int i=0; i<n-1; i++){
            if(s.charAt(i) != s.charAt(i+1)){
                diverse += s.charAt(i);
                diverse += s.charAt(i+1);
                isdiverse = true;
                break;
            }
        }
        
        if(isdiverse){
            System.out.println("YES");
            System.out.println(diverse);
        }
        else{
            System.out.println("NO");
        }

	}
}