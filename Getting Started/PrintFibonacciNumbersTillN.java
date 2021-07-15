import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      // write your code here
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      if(n == 1)
        System.out.println(0);
      else if(n >= 2)
      {
        n = n - 2;
        System.out.println(0);
        System.out.println(1);
        int a = 0, b = 1, c;
        for(int i = 0; i < n; i++)
        {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
      }
   }
}
/*
1. You've to print first n fibonacci numbers.
2. Take as input "n", the count of fibonacci numbers to print.
3. Print first n fibonacci numbers.
Input Format
n
Output Format
0
1
1
2
3
5
8
.. first n fibonaccis
/*