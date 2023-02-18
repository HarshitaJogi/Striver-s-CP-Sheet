import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class young_physicist{

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

        
        ArrayList<ArrayList<Integer>> a = new ArrayList<ArrayList<Integer>>();

        for(int i=0; i<n; i++){
            a.add(new ArrayList<Integer>());
        }

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                int x = sc.nextInt();
                a.get(i).add(x);
            }
        }

        int sumx = 0;
        int sumy = 0;
        int sumz = 0;


        for(int i=0; i<n; i++){
            sumx = sumx + a.get(i).get(0);
        }

        for(int i=0; i<n; i++){
            sumy = sumy + a.get(i).get(1);
        }

        for(int i=0; i<n; i++){
            sumz = sumz + a.get(i).get(2);
        }


        // for(int i=0; i<3; i++){
        //     p1[i] = sc.nextInt();
        // }

        //  int [] p2 = new int [3];
        // for(int i=0; i<3; i++){
        //     p2[i] = sc.nextInt();
        // }

        //  int [] p3 = new int [3];
        // for(int i=0; i<3; i++){
        //     p3[i] = sc.nextInt();
        // }

        // int ansx = p1[0] + p2[0] + p3[0];
        // int ansy = p1[1] + p2[1] + p3[1];
        // int ansz = p1[2] + p2[2] + p3[2];

        if(sumx == 0 && sumy == 0 && sumz == 0){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }



	}
}