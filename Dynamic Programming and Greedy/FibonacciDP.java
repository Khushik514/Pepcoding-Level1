import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] fibo = new int[n + 1];
    fibo[0] = 0;
    fibo[1] = 1;
    for(int i = 2; i <= n ; i++)
        fibo[i] = fibo[i - 1] + fibo[i - 2];
    System.out.println(fibo[n]);
 }
}
/*
1. You are given a number n.
2. You are required to print the nth element of fibonnaci sequence.

Note -> Notice precisely how we have defined the fibonnaci sequence
0th element -> 0
1st element -> 1
2nd element -> 1
3rd element -> 2
4th element -> 3
5th element -> 5
6th element -> 8
Input Format
A number n
Output Format
A number representing the nth element of fibonnaci sequence
*/