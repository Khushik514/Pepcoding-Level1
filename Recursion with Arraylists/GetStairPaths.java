import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(getStairPaths(n));
    }

    public static ArrayList<String> getStairPaths(int n) {
        if(n < 0)
            return new ArrayList<String>();
        if(n == 0)
        {
            ArrayList<String> a = new ArrayList<String>();
            a.add("");
            return a;
        }
        ArrayList<String> fres = new ArrayList<String>();
        for(int i = 1; i <= 3; i++)
        {
            ArrayList<String> res = getStairPaths(n - i);
            for(String s : res)
                fres.add(i + s);
        }
        return fres;
    }
}
/*
1. You are given a number n representing number of stairs in a staircase.
2. You are standing at the bottom of staircase. You are allowed to climb 1 step, 2 steps or 3 steps in one move.
3. Complete the body of getStairPaths function - without changing signature - to get the list of all paths that can be used to climb the staircase up.
Use sample input and output to take idea about output.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is. Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A number n
Output Format
Contents of the arraylist containing paths as shown in sample output
*/