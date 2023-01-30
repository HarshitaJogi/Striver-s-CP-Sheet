import java.io.*;
import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Generate_Parenthesis{
    
    static ArrayList<ArrayList<Character>> valid = new ArrayList<ArrayList<Character>>();

    public static void main(String[] args) {
		

		try {
			System.setIn(new FileInputStream("input.txt"));
			System.setOut(new PrintStream(new FileOutputStream("output.txt")));
		} catch (Exception e) {
			System.err.println("Error");
		}
		// FastReader sc = new FastReader();

        Scanner sc = new Scanner(System.in);
		
        int n = sc.nextInt();
        //String s = "";
        ArrayList<Character> s = new ArrayList<Character>();
        generate(s, n, n);

        
        // for(ArrayList<Character> st: valid){
        //     String ans= new String();
        //     for(Character c : st ){
        //         System.out.println("hii");
        //         ans+=c;
        //     }
        //     System.out.println(ans);
        // }

        // for(int i=0;i<valid.size();i++){
        //     //String ans= new String();
        //     // System.out.println("hii");
        //     ArrayList<Character> ans = valid.get(i);
        //     //System.out.println(ans);
        //     for(int j=0;j<valid.get(i).size();j++){
        //         //ans+=valid.get(i).get(j);
        //         System.out.print(ans.get(j));

        //     }

        //     System.out.println();

        // }


	}

    static void generate(ArrayList<Character> s, int open, int close){
        //StringBuffer sb= new StringBuffer(s); 

        if(open == 0 && close == 0){
            // passing the final string to arraylist
            //System.out.println(s);
            for(Character c: s){
                System.out.print(c);
            }
            System.out.println();
            valid.add(s);
            return; 
        }

        if(open>0){
            s.add('(');
            //System.out.print("open");
            generate(s, open-1, close);
            // removing the last element that we added so that orignal string
            // that we pass remains unchanged
            s.remove(s.size()-1);
        }

        if(close>0){
            // remaining number of open should be less than remaining number of close
            // bec number of open in string should be more than close
            if(open<close){
                s.add(')');
                generate(s, open, close-1);
                // removing the last element that we added so that orignal string
                // that we pass remains unchanged
                s.remove(s.size()-1);
            }
        }
    }
}
