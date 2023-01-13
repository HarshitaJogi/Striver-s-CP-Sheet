import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MiddleOfTheContest{

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
		

        String[] numbers_1 = sc.next().split(":");
        int h1 = Integer.parseInt(numbers_1[0]);
        int m1 = Integer.parseInt(numbers_1[1]);
        // System.out.println(h1);
        // System.out.println(m1);

        String[] numbers_2 = sc.next().split(":");
        int h2 = Integer.parseInt(numbers_2[0]);
        int m2 = Integer.parseInt(numbers_2[1]);
        // System.out.println(h2);
        // System.out.println(m2);

        int first = h1*60 + m1;
        int second = h2*60 + m2;

        int total = first + second;
        int half = total/2;

        int hours = half/60;
        if(hours<10){
            System.out.print("0" + hours + ":");
        }
        else{
            System.out.print(hours + ":");
        }
        int minutes = half%60;
        if(minutes<10){
            System.out.println("0" + minutes);
        }
        else{
            System.out.println(minutes);
        }

        //System.out.println(hours + ":" + minutes);

	}
}