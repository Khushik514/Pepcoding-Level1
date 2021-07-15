import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      Scanner sc = new Scanner(System.in);
      int n1 = sc.nextInt();
      int n2 = sc.nextInt();
      int x = (int)Math.min(n1, n2);
      int y = (int)Math.max(n1, n2);
      int res = 0;
      while(true)
      {
        res++;
        if((y * res) % x == 0)
            break;
      }
      int lcm = y * res;
      int gcd = (x * y)/lcm;
      System.out.println(gcd);
      System.out.println(lcm);
     }
}
/*
1. You are required to print the Greatest Common Divisor (GCD) of two numbers.
2. You are also required to print the Lowest Common Multiple (LCM) of the same numbers.
3. Take input "num1" and "num2" as the two numbers.
4. Print their GCD and LCM.
Input Format
num1
num2
.. the numbers whose GCD and LCM we have to find.
Output Format
a
b
.. where 'a' and 'b' are the GCD and LCM respectively.
*/