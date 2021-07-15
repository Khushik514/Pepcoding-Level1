import java.util.*;

public class Main{

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sp = (2 * n) - 3;
    for(int i = 1; i <= n; i++)
    {
        int j;
        for(j = 1; j <= i; j++)
            System.out.print(j + "\t");
        for(int k = 1; k <= sp; k++)
            System.out.print("\t");
        j--;
        if(j == n)
            j--;
        for(; j >= 1; j--)
            System.out.print(j + "\t");
        sp -= 2;
        System.out.println();
    }
 }
}
/*

7

1												1	
1	2										2	1	
1	2	3								3	2	1	
1	2	3	4						4	3	2	1	
1	2	3	4	5				5	4	3	2	1	
1	2	3	4	5	6		6	5	4	3	2	1	
1	2	3	4	5	6	7	6	5	4	3	2	1	

*/