import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // write ur code here
        int r = n;
        int sp = (n - 1) / 2;
        int j = 1;
        int k = 1;
        while(r > 0)
        {
            r--;
            for(int i = 0; i < sp; i++)
                System.out.print("\t");
            int x = k;
            for(int i = 1; i <= j; i++)
            {
                System.out.print(x + "\t");
                if(i <= j / 2)
                    x++;
                else
                    x--;
            }
            if(r > n / 2)
            {
                k++;
                j += 2;
                sp--;
            }
            else
            {
                k--;
                j -= 2;
                sp++;
            }
            System.out.println();
        }
    }
}
/*

5

		1	
	2	3	2	
3	4	5	4	3	
	2	3	2	
		1	

*/