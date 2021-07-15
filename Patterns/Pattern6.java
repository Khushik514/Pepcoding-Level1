import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = n;
        int sp = 1;
        int st = (n + 1) / 2;
        int flag = 0;
        while(r > 0)
        {
            r--;
            if(sp == n)
                flag = 1;
            for(int i = 0; i < st; i++)
                System.out.print("*\t");
            for(int i = 0; i < sp; i++)
                System.out.print("\t");
            for(int i = 0; i < st; i++)
                System.out.print("*\t");
            if(flag == 0)
            {
                st = st - 1;
                sp = sp + 2;
            }
            else
            {
                st = st + 1;
                sp = sp - 2;
            }
            System.out.println();
        }
    }
}
/*

5

*	*	*		*	*	*	
*	*				*	*	
*						*	
*	*				*	*	
*	*	*		*	*	*	

*/