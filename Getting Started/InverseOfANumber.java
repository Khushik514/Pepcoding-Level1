import java.util.*;

public class Main{

public static void main(String[] args) {
  // write your code here  
  Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int d = 0;
  boolean neg = false;
  if(n < 0)
    neg = true;
  else
    neg = false;
  n = (int)Math.abs(n);
  int n2 = n;
  while(n2 > 0)
  {
      d++;
      n2 /= 10;
  }
  int[] ar = new int[d + 1];
  int[] res = new int[d + 1];
  int i = 1;
  while(n > 0)
  {
    ar[i] = n % 10;
    i++;
    n = n / 10;
  }
  //ar = [5, 3, 1, 6 , 2, 4]
  //i = [1, 2, 3, 4, 5, 6]
  for(i = 1; i <= d; i++)
  {
    res[ar[i]] = i;
  }
  int result = 0;
  for(i = d; i >= 1; i--)
  {
    result = (result * 10) + res[i];
  }
  //res = [3, 5, 2, 6, 1, 4]
  //i = [1, 2, 3, 4, 5, 6]
  if(neg == true)
    result = result - (2 * result);
  System.out.println(result);
 }
}
/*
1. You are given a number following certain constraints.
2. The key constraint is if the number is 5 digits long, it'll contain all the digits from 1 to 5 without missing any and without repeating any. e.g. 23415 is a 5 digit long number containing all digits from 1 to 5 without missing and repeating any digit from 1 to 5.Take a look at few other valid numbers - 624135, 81456273 etc.Here are a few invalid numbers - 139, 7421357 etc.
3. The inverse of a number is defined as the number created by interchanging the face value and index of digits of number.e.g. for 426135 (reading from right to left, 5 is in place 1, 3 is in place 2, 1 is in place 3, 6 is in place 4, 2 is in place 5 and 4 is in place 6), the inverse will be 416253 (reading from right to left, 3 is in place 1, 5 is in place 2,2 is in place 3, 6 is in place 4, 1 is in place 5 and 4 is in place 6) More examples - inverse of 2134 is 1243 and inverse of 24153 is 24153    
4. Take as input number "n", assume that the number will follow constraints.
5. Print it's inverse.
Input Format
"n" where n is any integer, following constraints defined above.
Output Format
"i", the inverted number
*/