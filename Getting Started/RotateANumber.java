import java.util.*;
   
   public class Main{
   
   public static void main(String[] args) {
     // write your code here  
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int k = sc.nextInt();
     int d = 0;
     int nn = (int)Math.abs(n);
     while(nn > 0)
     {
        d++;
        nn /= 10;
     }
     k = k % d;
     if(k < 0)
        k = d + k;
     int res = n % (int)Math.pow(10, k);
     res = res * (int)Math.pow(10, d - k);
     res += n / (int)Math.pow(10, k);
     System.out.println(res);
    }
}
/*
1. You are given two numbers n and k. You are required to rotate n, k times to the right. If k is positive, rotate to the right i.e. remove rightmost digit and make it leftmost. Do the reverse for negative value of k. Also k can have an absolute value larger than number of digits in n.
2. Take as input n and k.
3. Print the rotated number.
4. Note - Assume that the number of rotations will not cause leading 0's in the result. e.g. such an input will not be given
   n = 12340056
   k = 3
   r = 05612340
Input Format
"n" where n is any integer.
"K" where k is any integer.
Output Format
"r", the rotated number
*/