import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] ar = new int[r][c];
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
            ar[i][j] = sc.nextInt();
    }
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
            System.out.print(ar[i][j] + " ");
        System.out.println();
    }
 }
}
/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to display the contents of 2d array as suggested by output format below.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
e11 e12 e13 ..
e21 e22 e23 ..
*/