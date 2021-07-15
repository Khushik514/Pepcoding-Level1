import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();
    int[][] ar = new int[r][c];
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c; j++)
            ar[i][j] = sc.nextInt();
    }
    int r2 = sc.nextInt();
    int c2 = sc.nextInt();
    int[][] ar2 = new int[r2][c2];
    for(int i = 0; i < r2; i++)
    {
        for(int j = 0; j < c2; j++)
            ar2[i][j] = sc.nextInt();
    }
    if(c == r2)
    {
    int[][] res = new int[r][c2];
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c2; j++)
        {
            for(int k = 0; k < r2; k++)
                res[i][j] += ar[i][k] * ar2[k][j];
        }
    }
    for(int i = 0; i < r; i++)
    {
        for(int j = 0; j < c2; j++)
            System.out.print(res[i][j] + " ");
        System.out.println();
    }
    }
    else
    {
        System.out.println("Invalid input");
    }
 }
}
/*
1. You are given a number n1, representing the number of rows of 1st matrix.
2. You are given a number m1, representing the number of columns of 1st matrix.
3. You are given n1*m1 numbers, representing elements of 2d array a1.
4. You are given a number n2, representing the number of rows of 2nd matrix.
5. You are given a number m2, representing the number of columns of 2nd matrix.
6. You are given n2*m2 numbers, representing elements of 2d array a2.
7. If the two arrays representing two matrices of dimensions n1 * m1 and n2 * m2 can be multiplied, display the contents of prd array as specified in output Format.
8. If the two arrays can't be multiplied, print "Invalid input".
Input Format
A number n1
A number m1
e11
e12..
e21
e22..
.. n1 * m1 number of elements of array a1
A number n2
A number m2
e11'
e12'..
e21'
e22'..
.. n2 * m2 number of elements of array a2
Output Format
e11' e12' e13' ..
e21' e22' e23' ..
.. elements of prd array
*/