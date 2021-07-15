import java.util.*;

public class Main{
    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int low = sc.nextInt();
        int high = sc.nextInt();
        for(int i = low; i <= high; i++)
        {
            int flag = 0;
            for(int j = 2; j <= (int)Math.sqrt(i); j++)
            {
                if(i % j == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag == 0)
                System.out.println(i);
        }
    }
}
/*
1. You've to print all prime numbers between a range. 
2. Take as input "low", the lower limit of range.
3. Take as input "high", the higher limit of range.
4. For the range print all the primes numbers between low and high (both included).
Input Format
low 
high
Output Format
n1
n2
.. all primes between low and high (both included)
*/