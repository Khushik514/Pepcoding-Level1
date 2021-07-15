import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write ur code here
        int n = sc.nextInt();
        int r = 1;
        int mid = (n + 1) / 2;
        int sp = (n - 1) / 2;
        int st = 1;
        while(r <= n)
        {
            for(int i = 1; i <= sp; i++)
            {
                if(r != mid)
                    System.out.print("\t");
                else
                    System.out.print("*\t");
            }
            for(int i = 1; i <= st; i++)
                System.out.print("*\t");
            if(r < mid)
            {
                st++;
            }
            else
                st--;
            System.out.println();
            r++;
        }
    }
}
/*

5

		*	
		*	*	
*	*	*	*	*	
		*	*	
		*	

*/