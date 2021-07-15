import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // write ur code here
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(j == i)
                    System.out.print("*\t");
                else if(j + i == n - 1)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            System.out.println();
        }
    }
}
/*

5

*				*	
	*		*		
		*			
	*		*		
*				*	

*/