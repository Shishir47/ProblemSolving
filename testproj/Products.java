package testproj;
import java.util.Scanner;
public class Products {

	public static void main(String[] args) {
		long n;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number to get Product: ");
		n= sc.nextLong();
		for(int i=1;i<=23;i++) {
			long result= n*i;
			System.out.println(n+" x "+i+" = "+result);
		}
		sc.close();
	}

}
