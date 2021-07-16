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
        int dir = 0;
        int i = 0;
        int j = 0;
        while(true)
        {
            dir = (dir + ar[i][j]) % 4;
            if(dir == 0)
                j++;
            else if(dir == 1)
                i++;
            else if(dir == 2)
                j--;
            else
                i--;
            if(j == c)
            {
                j--;
                break;
            }
            else if(j == -1)
            {
                j++;
                break;
            }
            else if(i == r)
            {
                i--;
                break;
            }
            else if(i == -1)
            {
                i++;
                break;
            }
        }
        System.out.println(i);
        System.out.println(j);
    }
}
/*
1. You are given a number n, representing the number of rows.
2. You are given a number m, representing the number of columns.
3. You are given n*m numbers (1's and 0's), representing elements of 2d array a.
4. Consider this array a maze and a player enters from top-left corner in east direction.
5. The player moves in the same direction as long as he meets '0'. On seeing a 1, he takes a 90 deg right turn.
6. You are required to print the indices in (row, col) format of the point from where you exit the matrix.
Input Format
A number n
A number m
e11
e12..
e21
e22..
.. n * m number of elements
Output Format
row
col (of the point of exit)

0   0   1   1       ->  ->  |
0   1   0   1           |   |/->    |
0   1   1   0           |   <-      |

2
3
*/