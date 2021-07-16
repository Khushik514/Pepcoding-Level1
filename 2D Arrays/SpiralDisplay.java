import java.io.*;
import java.util.*;

public class Main {

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
        int total = r * c;
        int srow = 0;
        int scol = 0;
        int erow = r;
        int ecol = c;
        int i = 0;
        int j = 0;
        while(true)
        {
            i = srow;
            j = scol;
            while(i < erow)
            {
                System.out.println(ar[i][j]);
                i++;
                total--;
            }
            if(total == 0)
                break;
            i--;
            scol++;
            j++;
            while(j < ecol)
            {
                System.out.println(ar[i][j]);
                total--;
                j++;
            }
            if(total == 0)
                break;
            j--;
            erow--;
            i--;
            while(i >= srow)
            {
                System.out.println(ar[i][j]);
                total--;
                i--;
            }
            if(total == 0)
                break;
            i++;
            ecol--;
            j--;
            while(j >= scol)
            {
                System.out.println(ar[i][j]);
                total--;
                j--;
            }
            if(total == 0)
                break;
            srow++;
        }
    }
}
/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers, representing elements of 2d array a.
4. You are required to traverse and print the contents of the 2d array in form of a spiral.
Note - Please check the sample output for details.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
e11
e21
..
en1
en2
en3
..
enm
e(n-1)m
..
e1m
e1(m-1)
..
e12
e22
e32
..

11 12 13 14 15
21 22 23 24 25
31 32 33 34 35

11
21
31
32
33
34
35
25
15
14
13
12
22
23
24
*/