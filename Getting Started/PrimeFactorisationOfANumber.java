import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int i = 2;
  while(i <= (int)Math.sqrt(n))
  {
    if(isPrime(i))
    {
        if(n % i == 0)
        {
            System.out.print(i + " ");
            n = n / i;
        }
        else
            i++;
    }
    else
        i++;
  }
  System.out.print(n);
 }
 static boolean isPrime(int n)
 {
    for(int i = 2; i <= (int)Math.sqrt(n); i++)
    {
        if(n % i == 0)
        return false;
    }
    return true;
 }
}
/*
1. You are required to display the prime factorization of a number.
    2. Take as input a number n.
    3. Print all its prime factors from smallest to largest.
                               
Input Format
n, an integer
Output Format
p1  p2  p3  p4.. all prime factors of n
*/