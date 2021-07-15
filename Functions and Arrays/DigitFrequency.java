import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        // write code here
        int count = 0;
        while(n > 0)
        {
            int x = n % 10;
            if(x == d)
                count++;
            n = n / 10;
        }
        return count;
    }
}
/*
1. You are given a number n.
2. You are given a digit d.
3. You are required to calculate the frequency of digit d in number n.
Input Format
A number n
A digit d
Output Format
A number representing frequency of digit d in number n
*/