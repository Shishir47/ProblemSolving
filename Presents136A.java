import java.util.Scanner;

public class Presents136A{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int [] arr= new int [t];
		for(int i=0; i<t; i++) {
		arr[i]=sc.nextInt();
		}
		for(int i=0; i<t; i++) {
			for(int j=0; j<t; j++) {
				if((i+1)==arr[j]) {
					System.out.print((j+1)+" ");
				}
			}
		}
		System.out.println();
		
		sc.close();
	}

}
