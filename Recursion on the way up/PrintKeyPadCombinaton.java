import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printKPC(s, "");
    }

    public static void printKPC(String str, String asf) {
        if(str.length() == 0)
        {
            System.out.println(asf);
            return;
        }
        char ch = str.charAt(0);
        String res = str.substring(1);
        String code = codes(ch);
        for(int i = 0; i < code.length(); i++)
        {
            char c = code.charAt(i);
            printKPC(res, asf + c);
        }
    }
    public static String codes(char ch)
    {
        switch(ch)
        {
            case '0' : return ".;";
            case '1' : return "abc";
            case '2' : return "def";
            case '3' : return "ghi";
            case '4' : return "jkl";
            case '5' : return "mno";
            case '6' : return "pqrs";
            case '7' : return "tu";
            case '8' : return "vwx";
            case '9' : return "yz";
        }
        return "";
    }
}
/*
1. You are given a string str. The string str will contains numbers only, where each number stands for a key pressed on a mobile phone.
2. The following list is the key to characters map
    0 -> .;
   1 -> abc
   2 -> def
   3 -> ghi
   4 -> jkl
   5 -> mno
   6 -> pqrs
   7 -> tu
   8 -> vwx
   9 -> yz
3. Complete the body of printKPC function - without changing signature - to print the list of all words that could be produced by the keys in str.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.     
                               
Input Format
A string str
Output Format
Words that can be produced by pressed keys indictated by str in order hinted by Sample output
Sample Input
78
Sample Output
tv
tw
tx
uv
uw
ux
*/