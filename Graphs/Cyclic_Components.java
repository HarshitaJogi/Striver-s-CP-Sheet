import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Cyclic_Components{

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

	static int N = (int)1E6;
    static ArrayList<Integer> [] g = new ArrayList[N];
    static boolean [] vis = new boolean [N];
    static int cnt = 0;
    static ArrayList<Integer> deg = new ArrayList<Integer>();

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

        for(int i=0; i<N; i++){
            g[i] = new ArrayList<Integer>();
        }

        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();

            g[x].add(y);
            g[y].add(x);
        }

        // int cnt = 0;
        // for(int i=1; i<=n; i++){
        //     if(vis[i] == true) continue;
        //     boolean cycle = dfs(i);
        //     if (cycle == true) cnt++;
        // }
        
        for(int i=1; i<=n; i++){
            if(vis[i] == true) continue;
            //deg.clear();
            dfs(i);
            boolean cycle = true;
            for(int j=0; j< deg.size(); j++){
                //System.out.println(deg.get(j));
                if(deg.get(j) != 2){
                    cycle = false;
                    break;
                } 
                // else{
                //     cycle = false;
                //     break;
                // }
            }

            if(cycle == true) cnt++;
            deg.clear();
            
        }


        

        System.out.println(cnt);


	}

    // static boolean dfs(int vertex){
    //     vis[vertex] = true;

    //     boolean isLoopExists;

    //     if(g[vertex].size() != 2) return false;

    //     for(int child: g[vertex]){
    //         System.out.println("parent is: " + vertex + " size is " + g[vertex].size());
    //         if(vis[child] == true && child == vertex) continue;
    //         if(vis[child] == true) return true;

    //         isLoopExists = isLoopExists & dfs(child);
    //     }

    //     return isLoopExists;
    // }

    static void dfs(int vertex){
        vis[vertex] = true;
        deg.add(g[vertex].size());
        //System.out.println(deg[vertex]);

        for(int child: g[vertex]){
            if(vis[child] == true) continue;
            dfs(child);
        }


        
    }
}