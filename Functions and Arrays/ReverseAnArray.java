import java.io.*;
import java.util.*;

public class Main{
  public static void display(int[] a){
    StringBuilder sb = new StringBuilder();

    for(int val: a){
      sb.append(val + " ");
    }
    System.out.println(sb);
  }

  public static void reverse(int[] a){
    // write your code here
    for(int i = 0; i < a.length / 2; i++)
    {
        int t = a[i];
        a[i] = a[a.length - i - 1];
        a[a.length - i - 1] = t;
    }
  }

public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }

    reverse(a);
    display(a);
 }
}
/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are required to reverse the contents of array a.
Input Format
Input is managed for you
Output Format
Output is managed for you
*/