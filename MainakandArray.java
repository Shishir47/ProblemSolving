import java.util.Arrays;
import java.util.Scanner;

public class MainakandArray {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int f;

		for(int i=0; i<n; i++) {
			f=sc.nextInt();
			int [] arr=new int [f];
			for(int j=0; j<f; j++) {
				arr[j]=sc.nextInt();
			}
			Arrays.sort(arr);
			System.out.println(arr[f-1]-arr[0]);
			
		}

	}

}
