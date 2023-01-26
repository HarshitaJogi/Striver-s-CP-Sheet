import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Hamburgers{

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

    static long nb, ns, nc, pb, ps, pc, r, b=0l, s=0l, c=0l;
    static String ham;

	public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		//FastReader sc = new FastReader();
        Scanner sc = new Scanner(System.in);
		
        ham = sc.nextLine();
        nb = sc.nextLong(); 
        ns = sc.nextLong();
        nc = sc.nextLong();
        pb = sc.nextLong();
        ps = sc.nextLong();
        pc = sc.nextLong();
        r = sc.nextLong();



        for(int i=0; i<ham.length(); i++){
            if(ham.charAt(i) == 'B') b++;
            else if(ham.charAt(i) == 'S') s++;
            else c++;
        }

        long low = 0l;
        long high = (long)1E15;

        while(high-low>1){
            long mid = low + (high - low)/2;

            if(canMake(mid)){
                low = mid;
            }
            else{
                high = mid - 1;
            }
        }

        if(canMake(high)){
            System.out.println(high);
        }
        else{
            System.out.println(low);
        }
	}

    static boolean canMake(long x){
        long bread = Math.max(0l, (b*x - nb));    // number of breads he needs to buy to make x hamburgers
        long sausage = Math.max(0l, (s*x - ns));
        long cheese = Math.max(0l, (c*x - nc));

        long total = bread*pb + sausage*ps + cheese*pc;

        if(total <= r){
            return true;
        }
        else{
            return false;
        }
    }
}