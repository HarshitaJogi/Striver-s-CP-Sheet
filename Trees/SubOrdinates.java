import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class subOrdinates{

	

	static int N = (int)1E7;
    static ArrayList<pair> [] g = new ArrayList[N];
    static boolean [] vis = new boolean [N];
    static int [] sumOfSubtree = new int [N];

    public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		//FastReader sc = new FastReader();
        Scanner sc = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		

        int n = sc.nextInt();


        for(int i=0; i<N; i++){
            g[i] = new ArrayList<pair>();
        }

        g[1].add(new pair(0, 0));
        g[0].add(new pair(1, 0));

        for(int i=2; i<=n; i++){
            int x = sc.nextInt();
            int wt = 1;

            g[i].add(new pair(x, 1));
            g[x].add(new pair(i, 1));
        }

        dfs(1);

        for(int i=1; i<=n; i++){
            System.out.print(sumOfSubtree[i] + " ");
        }

	}

    static void dfs(int source){
        vis[source] = true;
        //sumOfSubtree[source] += 1;

        for(pair child: g[source]){
            int child_n = child.x;
            int child_wt = child.y;
            if(child_n == source) continue;
            if(vis[child_n] == true) continue;

            vis[child_n] = true;
            dfs(child_n);
            sumOfSubtree[source] = sumOfSubtree[source] + sumOfSubtree[child_n] + child_wt;
            //System.out.print(sumOfSubtree[source] + " ");

        }
    }
}

class pair{
    int x, y;

    pair(int x, int y){
        this.x=x;
        this.y=y;
    }
}
