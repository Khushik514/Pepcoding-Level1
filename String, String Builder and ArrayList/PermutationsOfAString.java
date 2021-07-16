import java.io.*;
import java.util.*;

public class Main {

	public static void solution(String str){
		// write your code here
		int n = str.length();
		int f = factorial(n);
		int d = 0;
		while(d < f)
		{
		    StringBuilder sb = new StringBuilder(str);
		    int k = d;
		    for(int i = n; i >= 1; i--)
		    {
		        System.out.print(sb.charAt(k % i));
		        sb.deleteCharAt(k % i);
		        k = k / i;
		    }
		    System.out.println();
		    d++;
		}
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		String str = scn.next();
		solution(str);
	}
    static int factorial(int n)
    {
        int f = 1;
        for(int i = 2; i <= n; i++)
            f = f * i;
        return f;
    }
}
/*
1. You are given a string. 
2. You have to print all permutations of the given string iteratively.
Input Format
A String
Output Format
All permutations of the given string(one in a line). 
*/