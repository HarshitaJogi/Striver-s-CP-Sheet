import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class BoyOrGirl{

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
		
        String name = sc.nextLine();

        // HashSet<Character> s = new HashSet<Character>();
 
        // // Loop to traverse the string
        // for(int i = 0; i < name.length(); i++)
        // {
             
        //     // Insert current character
        //     // into the set
        //     s.add(name.charAt(i));
        // }
     
        // int n = s.size();
        // String ans = " ";

        // if(n%2 == 0){
        //     ans = 
        // }



        // Map <Character, Integer> m = new HashMap<Character, Integer>();
        // for(int i=0; i<name.length(); i++){
        //     if(m.containsKey(name.charAt(i))){
        //         m.replace(name.charAt(i), m.get(name.charAt(i))+1);
        //     }
        //     else{
        //         m.put(name.charAt(i),1);
        //     }
        // }

        HashSet <Character> set = new HashSet<Character>();
        for(int i=0; i<name.length(); i++){
            set.add(name.charAt(i));
        }


        int num = set.size();

        String ans = "IGNORE HIM!";
        if(num%2==0){
            ans = "CHAT WITH HER!";
        }
        System.out.println(ans);

	}
}