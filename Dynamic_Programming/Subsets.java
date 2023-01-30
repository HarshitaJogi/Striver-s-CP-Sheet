import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Subsets{

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

	static ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();

    public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		FastReader sc = new FastReader();
		
        int n = sc.nextInt();
        ArrayList<Integer> subset = new ArrayList<Integer>();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            a.add(x);
        }

        sub(subset, 0, a);

        // for(int i=0; i<ans.size(); i++){

        // }


	}

    static void sub(ArrayList<Integer> subset, int i, ArrayList<Integer> a){

        if(i == a.size()){
            System.out.println(subset);
            
            return;
        }

        // without considering ith element
        sub(subset, i+1, a);

        // including the ith element
        subset.add(a.get(i));
        sub(subset, i+1, a);
        subset.remove(subset.size()-1);
    }
}