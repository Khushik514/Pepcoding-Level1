import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < n; i++)
    {
        ar[i] = sc.nextInt();
        if(ar[i] > max)
            max = ar[i];
    }
    for(int i = max; i > 0 ; i--)
    {
        for(int j = 0; j < n; j++)
        {
            if(ar[j] >= i)
                System.out.print("*\t");
            else
                System.out.print("\t");
        }
        System.out.println();
    }
 }
}
/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to print a bar chart representing value of arr a.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A bar chart of asteriks representing value of array a
*/