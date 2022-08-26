package testproj;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter Number of Elements: ");
		int n=sc.nextInt();
		int[]array= new int [n];

		System.out.println("Enter "+n+" Elements: ");
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
			
		}
		Arrays.sort(array);
		System.out.println(Arrays.binarySearch(array, 0));
		System.out.println("The Sorted Array is: ");
		System.out.print("[");
		for(int i=0;i<n;i++) {
			System.out.print(array[i]);
			if(i<n-1) {
				System.out.print(", ");
			}
			else {
				break;
			}
		}
		
		System.out.print("]");
		System.out.println("\n"+array[n-1]);
		sc.close();
	}

}
