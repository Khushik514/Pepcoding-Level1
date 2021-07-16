import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] ar = new int[n][n];
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
                ar[i][j] = sc.nextInt();
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
            {
                int t = ar[i][j];
                ar[i][j] = ar[j][i];
                ar[j][i] = t;
            }
        }
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n / 2; j++)
            {
                int t = ar[i][j];
                ar[i][j] = ar[i][n - 1 - j];
                ar[i][n - 1 - j] = t;
            }
        }
        display(ar);
    }

    public static void display(int[][] ar){
        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[0].length; j++){
                System.out.print(ar[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
1. You are given a number n, representing the number of rows and number of columns.
2. You are given n*n numbers, representing elements of 2d array a.
3. You are required to rotate the matrix by 90 degree clockwise and then display the contents using display function.
*Note - you are required to do it in-place i.e. no extra space should be used to achieve it .*
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements
Output Format
output is taken care of by display function

Sample Input
4
11
12
13
14
21
22
23
24
31
32
33
34
41
42
43
44
Sample Output
41 31 21 11
42 32 22 12
43 33 23 13
44 34 24 14
*/