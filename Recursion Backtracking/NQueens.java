import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] board = new int[n][n];
        printNQueens(board, "", 0);
    }

    public static void printNQueens(int[][] chess, String qsf, int row) {
        if(row == chess.length)
        {
            System.out.println(qsf + ".");
            return;
        }
        for(int i = 0; i < chess.length; i++)
        {
            if(isSafe(row, i, chess))
            {
                chess[row][i] = 1;
                printNQueens(chess, qsf + row + "-" + i + ", ", row + 1);
                chess[row][i] = 0;
            }
        }
    }
    public static boolean isSafe(int row, int col, int[][] chess)
    {
        for(int i = row - 1; i >= 0; i--)
        {
            if(chess[i][col] == 1)
                return false;
        }
        for(int i = row - 1, j = col - 1; i >=0 && j >=0; i--, j--)
        {
            if(chess[i][j] == 1)
                return false;
        }
        for(int i = row - 1, j = col + 1; i >=0 && j < chess.length; i--, j++)
        {
            if(chess[i][j] == 1)
                return false;
        }
        return true;
    }
}
/*
1. You are given a number n, the size of a chess board.
2. You are required to place n number of queens in the n * n cells of board such that no queen can kill another.
Note - Queens kill at distance in all 8 directions
3. Complete the body of printNQueens function - without changing signature - to calculate and print all safe configurations of n-queens. Use sample input and output to get more idea.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
Output Format
Safe configurations of queens as suggested in sample output
Sample Input
4
Sample Output
0-1, 1-3, 2-0, 3-2, .
0-2, 1-0, 2-3, 3-1, .
*/