import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = n - 1; i >= 0; i--)
        {
            for(int j = i + 1; j < n; j++)
                System.out.print("\t");
            for(int j = 0; j <= i; j++)
                System.out.print("*\t");
            System.out.println();
        }
    }
}
/*

5

*	*	*	*	*	
	*	*	*	*	
		*	*	*	
			*	*	
				*

*/