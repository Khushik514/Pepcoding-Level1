import java.io.*;
import java.util.*;

public class Main{

public static void main(String[] args) throws Exception {
    // write your code here
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < n; i++)
    {
        int x = sc.nextInt();
        if(x < min)
            min = x;
        else if(x > max)
            max = x;
    }
    System.out.println(max - min);
 }
}
/*
1. You are given a number n, representing the count of elements.
2. You are given n numbers.
3. You are required to find the span of input. Span is defined as difference of maximum value and minimum value.
Input Format
A number n
n1
n2
.. n number of elements
Output Format
A number representing max - min
*/