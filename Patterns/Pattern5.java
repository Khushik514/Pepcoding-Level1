import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = n;
        int sp = (n - 1) / 2;
        int st = 1;
        int flag = 0;
        while(r > 0)
        {
            r--;
            if(st == n)
                flag = 1;
            for(int i = 0; i < sp; i++)
                System.out.print("\t");
            for(int i = 0; i < st; i++)
                System.out.print("*\t");
            for(int i = 0; i < sp; i++)
                System.out.print("\t");
            if(flag == 0)
            {
                st = st + 2;
                sp = sp - 1;
            }
            else
            {
                st = st - 2;
                sp = sp + 1;
            }
            System.out.println();
        }
    }
}
/*

5

		*	
	*	*	*	
*	*	*	*	*	
	*	*	*	
		*	

*/