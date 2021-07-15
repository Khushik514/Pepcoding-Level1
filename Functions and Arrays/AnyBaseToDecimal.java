import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int b = scn.nextInt();
      int d = getValueIndecimal(n, b);
      System.out.println(d);
   }
  
   public static int getValueIndecimal(int n, int b){
      int dec_value = 0;
        int base = 1;
        int temp = n;
        while (temp > 0) {
            int last_digit = temp % 10;
            temp = temp / 10;
            dec_value += last_digit * base;
            base = base * b;
        }
        return dec_value;
   }
}
/*
1. You are given a number n.
2. You are given a base b. n is a number on base b.
3. You are required to convert the number n into its corresponding value in decimal number system.
Input Format
A number n
A base b
Output Format
A decimal number representing corresponding value of n in base b.
*/