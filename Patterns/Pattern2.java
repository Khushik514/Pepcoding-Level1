import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            for(int j = i; j < n; j++)
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