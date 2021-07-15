import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j <= i; j++)
            {
                System.out.print(nCr(i, j) + "\t");
            }
            System.out.println();
        }
    }
    static int nCr(int n, int r)
    {
        return fact(n) / (fact(r) * fact(n - r));
    }
 
    // Returns factorial of n
    static int fact(int n)
    {
        int res = 1;
        for (int i = 2; i <= n; i++)
            res = res * i;
        return res;
    }
}
/*

5

1	
1	1	
1	2	1	
1	3	3	1	
1	4	6	4	1	

*/