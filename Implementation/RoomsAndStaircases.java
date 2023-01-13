import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RoomsAndStaircases{

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
            int n = sc.nextInt();
            String s = sc.nextLine();
            int ans = 0;

            // to check identical
            Boolean is_identical = false;
            Set <Character> set = new HashSet <Character>();
            for(int j=0; j<s.length(); j++){
                set.add(s.charAt(j));
            }
            if(set.size() == 1){
                is_identical = true;
            }

            if(is_identical){
                if(s.charAt(0) == '0'){
                    ans = n;
                }
                else{
                    ans = 2*n;
                }
            }

            else{
                int current = 0;
                int flag = 0;
                for(int j=0; j<s.length(); j++){
                    if(s.charAt(j) == '1'){
                        flag = j+1;
                        current = flag-1 + flag-1 + 2;
                        ans = Math.max(ans, current);
                    }
                }
                for(int j=s.length()-1; j>=0; j--){
                    if(s.charAt(j) == '1'){
                        flag = j+1;
                        current = n-flag + n-flag + 2;
                        ans = Math.max(ans, current);
                    }
                }
            }


        System.out.println(ans);
        }


	}
}