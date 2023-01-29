import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;


// for input
// int t = Integer.parseInt(br.readLine());
// long l = Long.parseLong(br.readLine());
// String s = br.readLine();

// for output
// for (int i = 0; i < n; i++)
//     sb.append(arr[i] + " ");
 
// // finally printing the string
// System.out.println(sb);


public class Ichihime_and_Triangle{

	

	public static void main(String[] args) throws IOException{
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuffer sb = new StringBuffer();
        Scanner sc = new Scanner(System.in);
            
        
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();

            // long x = a + (b-a)/2;
            // long y = b + (c-b)/2;
            // long z = c + (d-c)/2;

            System.out.println(b + " " + c + " " + c);
        }



        //br.close();

	}
}
