import java.io.*;
import java.util.*;

public class Main {

	public static String toggleCase(String s){
		//write your code here
        String res = "";
        for(int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            char curr;
            if(ch >= 'A' && ch <= 'Z')
                curr = (char)(ch + 32);
            else
                curr = (char)(ch - 32);
            res = res + curr;
        }
		return res;
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		System.out.println(toggleCase(str));
	}
}
/*
1. You are given a string that contains only lowercase and uppercase alphabets. 
2. You have to toggle the case of every character of the given string.
Input Format
A String
Output Format
A String
*/