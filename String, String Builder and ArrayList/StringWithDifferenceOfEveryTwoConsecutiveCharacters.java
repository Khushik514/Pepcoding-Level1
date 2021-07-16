import java.io.*;
import java.util.*;

public class Main {

	public static String solution(String s){
		// write your code here
        String res = "";
        int i;
        for(i = 0; i < s.length() - 1; i++)
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(i + 1);
            res = res + ch1 + (int)(ch2 - ch1);
        }
        res = res + s.charAt(i);
		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(solution(str));
	}
}
/*
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to form a string that contains the difference of ASCII values of every two consecutive characters between those characters.
   For "abecd", the answer should be "a1b3e-2c1d", as 
   'b'-'a' = 1
   'e'-'b' = 3
   'c'-'e' = -2
   'd'-'c' = 1
Input Format
A String
Output Format
A String
*/