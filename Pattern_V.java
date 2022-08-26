import java.util.Scanner;
public class Pattern_V {

	public static void main(String[] args) {
		int i, j, n;
       Scanner sc=new Scanner(System.in);
	    System.out.print("Enter rows: ");
	    n= sc.nextInt();

	    for(i=1; i<=n; i++)
	    {
	        // Prints first part of pattern
	        for(j=1; j<=i; j++)
	        {
	            System.out.print(j);
	        }

	        // Prints spaces between two parts
	        for(j=i*2; j<n*2; j++)
	        {
	            System.out.print(" ");
	        }

	        // Prints second part of the pattern
	        for(j=i; j>=1; j--)
	        {
	            System.out.print(j);
	        }

	        System.out.println();
	    }


	}

}
