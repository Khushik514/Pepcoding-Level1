import java.util.*;

public class Main{

public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    // write ur code here
    int n = sc.nextInt();
    int r = n;
    int sp = (n - 1) / 2;
    int sp2 = -1;
    int flag = 0;
    while(r > 0)
    {
        r--;
        for(int i = 0; i < sp; i++)
            System.out.print("\t");
        System.out.print("*\t");
        for(int i = 0; i < sp2; i++)
            System.out.print("\t");
        if(r != 0 && r != n - 1)
        {
            System.out.print("*\t");
        }
        for(int i = 0; i < sp; i++)
            System.out.print("\t");
        System.out.println();
        if(r > n / 2)
        {
            sp -= 1;
            sp2 += 2;
        }
        else
        {
            sp += 1;
            sp2 -= 2;
        }
    }
 }
}
/*

5

		*	
	*		*	
*				*	
	*		*	
		*	

*/