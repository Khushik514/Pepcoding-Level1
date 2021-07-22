import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printEncodings(s, "");
    }

    public static void printEncodings(String str, String asf) {
        if(str.length() == 0)
        {
            System.out.println(asf);
            return;
        }
        else if(str.length() == 1)
        {
            char ch = str.charAt(0);
            if(ch == '0')
                return;
            System.out.println(asf + code(ch - '0'));
        }
        else
        {
            char ch = str.charAt(0);
            String res = str.substring(1);
            if(ch == '0')
                return;
            else
                printEncodings(res, asf + code(ch - '0'));
            String c = str.substring(0, 2);
            res = str.substring(2);
            int cc = Integer.parseInt(c);
            if(cc <= 26 && cc >= 0)
                printEncodings(res, asf + code(cc));
        }
    }
    
    public static char code(int ch)
    {
        switch(ch)
        {
            case 1 : return 'a';
            case 2 : return 'b';
            case 3 : return 'c';
            case 4 : return 'd';
            case 5 : return 'e';
            case 6 : return 'f';
            case 7 : return 'g';
            case 8 : return 'h';
            case 9 : return 'i';
            case 10 : return 'j';
            case 11 : return 'k';
            case 12 : return 'l';
            case 13 : return 'm';
            case 14 : return 'n';
            case 15 : return 'o';
            case 16 : return 'p';
            case 17 : return 'q';
            case 18 : return 'r';
            case 19 : return 's';
            case 20 : return 't';
            case 21 : return 'u';
            case 22 : return 'v';
            case 23 : return 'w';
            case 24 : return 'x';
            case 25 : return 'y';
            case 26 : return 'z';
        }
        return '\0';
    }
}
/*
1. You are given a string str of digits. (will never start with a 0)
2. You are required to encode the str as per following rules
    1 -> a
    2 -> b
    3 -> c
    ..
    25 -> y
    26 -> z
3. Complete the body of printEncodings function - without changing signature - to calculate and print all encodings of str.
Use the input-output below to get more understanding on what is required
123 -> abc, aw, lc
993 -> iic
013 -> Invalid input. A string starting with 0 will not be passed.
103 -> jc
303 -> No output possible. But such a string maybe passed. In this case print nothing.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Permutations of str in order hinted by Sample output

Sample Input
655196

Sample Output
feeaif
feesf
*/