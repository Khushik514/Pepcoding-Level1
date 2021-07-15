import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int b = scn.nextInt();
      int n1 = scn.nextInt();
      int n2 = scn.nextInt();
      int d = getSum(b, n1, n2);
      System.out.println(d);
   }
  
   public static int getSum(int b, int n1, int n2){
       // write ur code here
       if(b == 10)
        return (n1 + n2);
       n1 = getValueIndecimal(n1, b);
       n2 = getValueIndecimal(n2, b);
       int res = n1 + n2;
       res = getValueInBase(res, b);
       return res;
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
   public static int getValueInBase(int n, int b){
        int res = 0;
        int count = 1;
        while(n > 0)
        {
            res = res + (n % b) * count;
            count = count * 10;
            n = n / b;
        }
        return res;
   }
}
/*
1. You are given a base b.
2. You are given two numbers n1 and n2 of base b.
3. You are required to add the two numbes and print their value in base b.
Input Format
A base b
A number n1
A number n2
Output Format
A number representing the sum of n1 and n2 in base b.
*/