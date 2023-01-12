import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class kString{

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
		
        int k = sc.nextInt();
        String s = sc.nextLine();
        Map <Character, Integer> map = new HashMap <Character, Integer>();


        for(int i=0; i<s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i), map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }

        String ans="";
        for(Map.Entry m : map.entrySet()){    
            //System.out.println(m.getKey());
            int o = (Integer)m.getValue();  
            int x = o%k;
            if(x!=0){
                ans = "-1";
            }  
        } 

        if(ans != "-1"){
            String h = "";
            for(Map.Entry m : map.entrySet()){
                int freq = (Integer)m.getValue()/k;
                //System.out.println(freq);
                for(int i=0; i<freq; i++){
                    h = h + m.getKey();
                }
                
            }
            //System.out.println(h);
            for(int i=0; i<k; i++){
                ans = ans + h;
            }

        }
        
       
        System.out.println(ans);

        


	}
}