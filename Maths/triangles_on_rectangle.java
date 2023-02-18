import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class triangles_on_rectangle{

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
        for(int e=0; e<t; e++){

            long w = sc.nextLong();
            long h = sc.nextLong();

            long h1 = sc.nextLong();
            long [] xaxis = new long [(int)h1];
            for(int i=0; i<h1; i++){
                xaxis[i] = sc.nextLong();
            }

            long h2 = sc.nextLong();
            long [] hori = new long [(int)h2];
            for(int i=0; i<h2; i++){
                hori[i] = sc.nextLong();
            }

            long y1 = sc.nextLong();
            long [] yaxis = new long [(int)y1];
            for(int i=0; i<y1; i++){
                yaxis[i] = sc.nextLong();
            }

            long y2 = sc.nextLong();
            long [] verti = new long [(int)y2];
            for(int i=0; i<y2; i++){
                verti[i] = sc.nextLong();
            }

            long [] area = new long[4];

            // triangle with base on x axis
            long base1 = Math.abs(xaxis[0] - xaxis[(int)h1-1]);
            long ht1 = h;
            long a1 = base1*ht1;
            area[0] = a1;

            // triangle with base on horizontal line
            long base2 = Math.abs(hori[0] - hori[(int)h2-1]);
            long ht2 = h;
            long a2 = base2*ht2;
            area[1] = a2;

             // triangle with base on y axis
            long base3 = Math.abs(yaxis[0] - yaxis[(int)y1-1]);
            long ht3 = w;
            long a3 = base3*ht3;
            area[2] = a3;

            // triangle with base on vertical line
            long base4 = Math.abs(verti[0] - verti[(int)y2-1]);
            long ht4 = w;
            long a4 = base4*ht4;
            area[3] = a4;

            Arrays.sort(area);

            System.out.println(area[3]);

        }


	}
}