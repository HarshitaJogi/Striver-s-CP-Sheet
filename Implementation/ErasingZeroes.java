import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ErasingZeroes{

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
        // for(int i=0; i<t; i++){
        //     String s = sc.nextLine();
        //     int first = s.length();
        //     for(int j=0; j<s.length(); j++){
        //         if(s.charAt(j)=='1'){
        //            first = j;
        //            break; 
        //         } 
        //     }

        //     int last = -1;
        //     for(int k=s.length()-1; k>=0; k--){
        //         if(s.charAt(k)=='1'){
        //            last = k;
        //            break; 
        //         } 
        //     }

        //     int total = 0;
        //     for(int m=first; m<=last; m++){
        //         if(s.charAt(m)==0) total++;
        //     }
        //     System.out.println(total);
        // }
        while(t-->0){
            String s=sc.next();
            boolean z=false;
            int first=s.length();
            for(int i=0;i<s.length();i++){
                if(s.charAt(i)=='1'){
                    first=i;
                    break;
                }
            }
            int last=-1;
            for(int i=s.length()-1;i>=0;i--){
                if(s.charAt(i)=='1'){
                    last=i;
                    break;
                }
            }
            int total=0;
            for(int i=first;i<=last;i++){
                if(s.charAt(i)=='0')total++;
            }
            System.out.println(total);
        }


	}
}