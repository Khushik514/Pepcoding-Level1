import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
  
       // write ur code here
    int t = scn.nextInt();
    while(t > 0)
    {
        t--;
        int n = scn.nextInt();
        int flag = 0;
        for(int i = 2; i <= (int)Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
            System.out.println("not prime");
        else
            System.out.println("prime");
    }
   }
}
/*
1. You've to check whether a given number is prime or not.
2. Take a number "t" as input representing count of input numbers to be tested.
3. Take a number "n" as input "t" number of times.
4. For each input value of n, print "prime" if the number is prime and "not prime" otherwise.
Input Format
A number t
A number n
A number n
.. t number of times
Output Format
prime
not prime
not prime
.. t number of times
*/
