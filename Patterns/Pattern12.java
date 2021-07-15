import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n == 1)
            System.out.println("0");
        if(n >= 2)
        {
            System.out.println("0");
            System.out.println("1\t1");
            int a = 1;
            int b = 1;
            int c;
            for(int i = 2; i < n; i++)
            {
                for(int j = 0; j <= i; j++)
                {
                    c = a + b;
                    System.out.print(c + "\t");
                    a = b;
                    b = c;
                }
                System.out.println();
            }
        }
    }
}
/*

5

0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	

*/