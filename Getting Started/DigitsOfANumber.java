import java.util.*;
public class Main{
public static void main(String[] args) {
    // write your code here     
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int d = 0;
    int nn = n;
    while(n > 0)
    {
        d++;
        n = n / 10;
    }
    while(d > 0)
    {
        d--;
        int dd = nn / (int)Math.pow(10, d);
        System.out.println(dd);
        nn = nn % (int)Math.pow(10, d);
    }
    }
}
/*
1. You've to display the digits of a number.
2. Take as input "n", the number for which digits have to be displayed.
3. Print the digits of the number line-wise.
Input Format
"n" where n is any integer.
Output Format
d1
d2
d3
... digits of the number
*/