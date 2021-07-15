import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
    // write your code here  
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    long x, y, z;
    if(a > b)
    {
        if(a > c)
        {
            x = a;
            y = b;
            z = c;
        }
        else
        {
            x = c;
            y = b;
            z = a;
        }
    }
    else
    {
        if(b > c)
        {
            x = b;
            y = a;
            z = c;
        }
        else
        {
            x = c;
            y = a;
            z = b;
        }
    }
    System.out.println((x * x) == ((y * y) + (z * z)));
   }
}
/*
1. You are required to check if a given set of numbers is a valid pythagorean triplet.
2. Take as input three numbers a, b and c.
3. Print true if they can form a pythagorean triplet and false otherwise.
Input Format
a, an integer
b, an integer
c, an integer
Output Format
true if the numbers form a pythagorean triplet and false otherwise
*/