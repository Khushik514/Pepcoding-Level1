import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printPermutations(s, "");
    }
    public static void printPermutations(String str, String asf) {
        if(str.length() == 0)
        {
            System.out.println(asf);
            return;
        }
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            String part1 = str.substring(0, i);
            String part2 = str.substring(i + 1);
            printPermutations(part1 + part2, asf + ch);
        }
    }
}
/*
1. You are given a string str.
2. Complete the body of printPermutations function - without changing signature - to calculate and print all permutations of str.
Use sample input and output to take idea about permutations.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Permutations of str in order hinted by Sample output
Sample Input
abc
Sample Output
abc
acb
bac
bca
cab
cba
*/