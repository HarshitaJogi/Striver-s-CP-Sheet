import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Poisoned_Dagger{

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
		
        long t = sc.nextLong();

        for(long a=0l; a<t; a++){

            long n = sc.nextLong();
            long h = sc.nextLong();
            long [] time = new long [(int)n];
            for(long i=0; i<n; i++){
                time[(int)i] = sc.nextLong();
            }

            long low = 1;
            long high = h;

            while(low <= high){
                long mid = low + (high - low)/2;

                if(canKill(mid, time, h, n)){
                    high = mid-1;
                }
                else{
                    low = mid+1;
                }
            }

            System.out.println(low);
        }


	}

    static boolean canKill(long mid, long time[], long h, long n){
        long damage = 0;
        for(long i=0; i<n-1; i++){
            if(time[(int)i] + mid > time[(int)i+1]){
                // checking if next number is encountered or not
                damage = damage + (time[(int)i+1] - time[(int)i]);
            }
            else{
                damage = damage + mid;
            }
        }
        // to add 'mid' amount of damage to the last element of time array, 
        //as in for loop we are only checking till second last term of time array.
        damage = damage + mid;

        if(damage >= h){
            return true;
        }
        else{
            return false;
        }
    }


}