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

  public static void rotate(int[] a, int k){
    // write your code here
    int n = a.length;
    k = k % n;
    if(k < 0)
        k = n + k;
    reverse(a, n - k, n);
    reverse(a, 0, n - k);
    reverse(a, 0 , n);
    
  }
    public static void reverse(int[] a, int low, int high){
    // write your code here
    
    for(int i = low; i < (low + high) / 2; i++)
    {
        int t = a[i];
        a[i] = a[(low + high) - i - 1];
        a[(low + high) - i - 1] = t;
    }
  }
public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(br.readLine());
    int[] a = new int[n];
    for(int i = 0; i < n; i++){
       a[i] = Integer.parseInt(br.readLine());
    }
    int k = Integer.parseInt(br.readLine());

    rotate(a, k);
    display(a);
 }
}
/*
1. You are given a number n, representing the size of array a.
2. You are given n numbers, representing elements of array a.
3. You are given a number k.
4. Rotate the array a, k times to the right (for positive values of k), and to
the left for negative values of k.
Input Format
Input is managed for you
Output Format
Output is managed for you
*/