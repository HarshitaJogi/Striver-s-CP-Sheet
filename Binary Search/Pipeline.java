
import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Pipeline{
 
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
        
 
        long n = sc.nextLong();
        long k = sc.nextLong();
        long ans = -1;
 
        if(n==1){
            ans = 0l;
        }
        else if(n==k){
            ans = 1;
        }
 
        else{
 
            long low = 1;
            long high = k-1;
 
            while(low<=high){
                long mid = low + (high - low)/2;

                // if(isPossible(mid, n, k)){
                //     ans = mid;
                //     high = mid - 1;
                // }
                // else{
                //     low = mid + 1;
                // }

                //sum of AP
                // first element: k-mid, last element: k-1, no of elements: mid
                long sum = mid*((k-mid) + (k-1))/2;
                if(n-1 <= sum){
                    ans = mid;
                    high = mid - 1;
                }
                else{
                    low = mid + 1;
                }
 
                
            }
 
        }
 
        System.out.println(ans);
 
    }
 
    // static boolean isPossible(long x, long n, long k){
    //     long splitters = 1;
    //     long sum=k;   // total number of outputs after adding a splitter
 
    //     for(long i=k-1; i>=2; i--){
    //         //sum = sum + i-1;
    //         if(sum<n){
    //             sum = sum + i-1;
    //             //System.out.println("Sum is " + sum);
    //             splitters++;
    //         }
 
    //     }
    //     //System.out.println(splitters);
 
    //     if(splitters == x){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
}
