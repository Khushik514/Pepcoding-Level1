import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        int[] ways = new int[n + 1];
        ways[n] = 1;
        for(int i = n - 1; i >= 0; i--)
        {
            for(int j = 1; j <= ar[i]; j++)
            {
                if(i + j <= n)
                    ways[i] += ways[i + j];
            }
        }
        System.out.println(ways[0]);
    }
}
/*
1. You are given a number n, representing the number of stairs in a staircase.
2. You are on the 0th step and are required to climb to the top.
3. You are given n numbers, where ith element's value represents - till how far from the step you 
     could jump to in a single move.  
     You can of course jump fewer number of steps in the move.
4. You are required to print the number of different paths via which you can climb to the top.
Input Format
A number n
.. n more elements
Output Format
A number representing the number of ways to climb the stairs from 0 to top.

Sample Input
10
3
3
0
2
1
2
4
2
0
0
Sample Output
5
*?