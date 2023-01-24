import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Two_Buttons{

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

	static int N = (int)1E4;
    static boolean [] vis = new boolean [N];
    static int [] level = new int [N];
    //static long [] level = new long [N];

    public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		FastReader sc = new FastReader();

		
        int n = sc.nextInt();
        //long n = sc.nextLong();
        int m = sc.nextInt();
        //long m = sc.nextLong();

        bfs(n, m);

        System.out.println(level[m]);

	}

    static void bfs(int n, int m){
        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        vis[n] = true;

        while(!q.isEmpty()){
            int curr = q.poll();

            //if(curr == m) break;

            if(curr-1>0 && vis[curr-1] == false){
                q.add(curr-1);
                vis[curr-1] = true;
                level[curr-1] = level[curr] + 1;
            }

            if(curr*2 <= 2*(m-1) && vis[curr*2] == false){
                q.add(curr*2);
                vis[curr*2] = true;
                level[curr*2] = level[curr] + 1;
            }

            if(curr == m || curr-1 == m || curr*2 == m) break;
        }
    }
}