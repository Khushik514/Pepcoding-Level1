import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sourceBase = scn.nextInt();
     int  destBase= scn.nextInt();
     int res = getValueIndecimal(n, sourceBase);
     res = getValueInBase(res, destBase);
     System.out.println(res);
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
1. You are given a number n.
2. You are given a base b1. n is a number on base b.
3. You are given another base b2.
4. You are required to convert the number n of base b1 to a number in base b2.
Input Format
A number n
A base b1
A base b2
Output Format
A number of base b2 equal in value to n of base b1.
*/