import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int x = sc.nextInt();
        System.out.println(firstIndex(arr, 0, x));
    }
    public static int firstIndex(int[] arr, int idx, int x){
        if(idx == arr.length)
            return -1;
        if(arr[idx] == x)
            return idx;
        return firstIndex(arr, idx + 1, x);
    }
}
/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are given a number x. 
4. You are required to find the first index at which x occurs in array a.
5. If x exists in array, print the first index where it is found otherwise print -1.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
n1
n2
.. n number of elements
A number x
Output Format
A number representing first index of occurence of x in array a or -1 if not found at all.
*/