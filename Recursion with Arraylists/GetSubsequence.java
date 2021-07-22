import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(gss(s));
    }

    public static ArrayList<String> gss(String str) {
        if(str.length() == 0)
        {
            ArrayList<String> a = new ArrayList<String>();
            a.add("");
            return a;
        }
        char ch = str.charAt(0);
        String res = str.substring(1);
        ArrayList<String> ress = gss(res);
        ArrayList<String> fres = new ArrayList<String>();
        for(String s : ress)
        {
            fres.add("" + s);
        }
        for(String s : ress)
        {
            fres.add(ch + s);
        }
        return fres;
    }
}
/*
1. You are given a string str.
2. Complete the body of getSS function - without changing signature - to calculate all subsequences of str.
Use sample input and output to take idea about subsequences.

Note -> The online judge can't force you to write the function recursively but that is what the spirit of question is.
Write recursive and not iterative logic. The purpose of the question is to aid learning recursion and not test you.
Input Format
A string str
Output Format
Contents of the arraylist containing subsequences as shown in sample output
*/