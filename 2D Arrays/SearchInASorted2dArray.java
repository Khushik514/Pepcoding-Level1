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
        int x = sc.nextInt();
        int flag = -1;
        int i = 0, j = 0;
        for(i = 0; i < n; i++)
        {
            if(x >= ar[i][0] && x <= ar[i][n - 1])
            {
                j = binarySearch(ar, i, x);
                if(j != -1)
                {
                    flag = 0;
                    break;
                }
            }
        }
        if(flag == 0)
            System.out.println(i + "\n" + j);
        else
            System.out.println("Not Found");
    }
    static int binarySearch(int[][] ar, int i, int x)
    {
        int low = 0;
        int high = ar.length;
        int mid;
        while(low <= high)
        {
            mid = (low + high) / 2;
            if(ar[i][mid] == x)
                return mid;
            else if(ar[i][mid] > x)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
/*
1. You are given a number n, representing the number of rows and columns of a square matrix.
2. You are given n * n numbers, representing elements of 2d array a. 
Note - Each row and column is sorted in increasing order.
3. You are given a number x.
4. You are required to find x in the matrix and print it's location int (row, col) format as discussed in output format below.
5. In case element is not found, print "Not Found".
Input Format
A number n
e11
e12..
e21
e22..
.. n * n number of elements of array a
A number x
Output Format
row
col of the location where element is found or "Not Found" if element is not in the matrix
/*