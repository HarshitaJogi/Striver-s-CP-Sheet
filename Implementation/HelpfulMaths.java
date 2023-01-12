import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class HelpfulMaths{

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
		//FastReader sc = new FastReader();
        Scanner sc = new Scanner(System.in);
		
        String s = sc.nextLine();
        int one = 0;
        int two = 0;
        int three = 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                one++;
            }
            if(s.charAt(i)=='2'){
                two++;
            }
            if(s.charAt(i)=='3'){
                three++;
            }
        }

       
        // if(one==1 && two==0 && three==0){
        //     System.out.println("1");
        // }
        // else if(one==0 && two==1 && three==0){
        //     System.out.println("2");
        // }
        // else if(one==0 && two==0 && three==1){
        //     System.out.println("3");
        // }
        // else{
        //     System.out.print("1+".repeat(one));
        //     System.out.print("2+".repeat(two));
        //     System.out.print("3+".repeat(three-1));
        //     System.out.print("3");
        // }

        // for(int i=0; i<one; i++){
        //     System.out.print("1");
        //     if(i!=one-1){
        //         System.out.print("+");
        //     }
            
        // }

        // if(one!=0){
        //     System.out.print("+");
        // }

        // for(int i=0; i<two; i++){
        //     System.out.print("2");
        //     if(i!=two-1){
        //         System.out.print("+");
        //     }

        // }

        // if(three!=0){
        //     System.out.print("+");
        // }


        // for(int i=0; i<three; i++){
        //     System.out.print("3");
        //     if(i!=three-1){
        //         System.out.print("+");
        //     }
            
        // }

        String ans = "";
        for(int i=0; i<one; i++){
            ans += "1+";
        }
        for(int i=0; i<two; i++){
            ans += "2+";
        }
        for(int i=0; i<three; i++){
            ans += "3+";
        }

        for(int i=0; i<ans.length()-1; i++){
            System.out.print(ans.charAt(i));
        }

        
	}
}