import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ar = new int[n];
        int mid;
        for(int i = 0; i < n; i++)
            ar[i] = sc.nextInt();
        for(int i = 0; i < n / 2; i++)
        {
            int t = ar[i];
            ar[i] = ar[n - i - 1];
            ar[n - i - 1] = t;
        }
        int p = (int)Math.pow(2, n);
        ArrayList<int[]> bin = new ArrayList<int[]>();
        for(int i = 0; i < p; i++)
        {
            int k = i;
            int[] curr = new int[n];
            int j = 0;
            while(k > 0)
            {
                curr[j] = k % 2;
                j++;
                k /= 2;
            }
            bin.add(curr);
        }
        for(int[] arr : bin)
        {
            for(int i = n - 1; i >= 0; i--)
            {
                if(arr[i] == 1)
                    System.out.print(ar[i] + "\t");
                else
                    System.out.print("-\t");
            }
            System.out.println();
        }
 }
}
/*

Easy  Prev   Next
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to print all subsets of arr. Each subset should be
on separate line. For more clarity check out sample input and output.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
[Tab separated elements of subset]
..
All subsets

Sample Input
3
10
20
30
Sample Output
-	-	-	
-	-	30	
-	20	-	
-	20	30	
10	-	-	
10	-	30	
10	20	-	
10	20	30	
*/