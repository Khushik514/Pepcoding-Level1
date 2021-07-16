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
        int min = ar[0][0];
        int c = 0;
        int flag = -1;
        for(int i = 0; i < n; i++)
        {
            min = ar[i][0];
            c = 0;
            for(int j = 1; j < n; j++)
            {
                if(ar[i][j] < min)
                {
                    min = ar[i][j];
                    c = j;
                }
            }
            int k;
            for(k = 0; k < n; k++)
            {
                if(ar[k][c] > min)
                    break;
            }
            if(k == n)
            {
                flag = 0;
                break;
            }
        }
        if(flag == 0)
            System.out.println(min);
        else
            System.out.println("Invalid input");
    }
}
/*
1. You are given a square matrix of size 'n'. You are given n*n elements of the square matrix. 
2. You are required to find the saddle price of the given matrix and print the saddle price. 
3. The saddle price is defined as the least price in the row but the maximum price in the column of the matrix.
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
Output Format
Saddle point of the matrix if available or "Invalid input" if no saddle point is there.
*/