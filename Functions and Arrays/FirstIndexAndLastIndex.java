import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] ar = new int[n];
    for(int i = 0; i < n; i++)
        ar[i] = sc.nextInt();
    int d = sc.nextInt();
    int flag = 0;
    int first = -1;
    int last = -1;
    for(int i = 0; i < n; i++)
    {
        if(ar[i] == d)
        {
            if(flag == 0)
            {
                flag = 1;
                first = i;
                last = i;
            }
            else
                last = i;
        }
    }
    System.out.println(first);
    System.out.println(last);
 }
}
/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.

Asssumption - Array is sorted. Array may have duplicate values.
Input Format
A number n
n1
n2
.. n number of elements
A number d
Output Format
A number representing first index
A number representing last index
*/