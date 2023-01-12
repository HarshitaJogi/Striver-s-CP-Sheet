import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class RoundNumbers{

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

        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            List<Integer> list = new ArrayList<Integer>();
            List<String> ans = new ArrayList<String>();

            // To extract digits:
            while(num!=0){
                int rem = num%10;
                num = num/10;
                list.add(rem);
            }

            for(int j=list.size()-1; j>=0; j--){
                if(list.get(j) == 0) continue;
                else{
                    String z = Integer.toString(list.get(j));
                    ans.add(z + "0".repeat(j));
                }
            }

            int l=ans.size();
            System.out.println(l);
            for(int k=0; k<ans.size(); k++){
                System.out.println(ans.get(k));
            }
        }

	}
}