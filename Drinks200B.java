import java.util.Scanner;

public class Drinks200B {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		double n=sc.nextInt();
		double count=0;
		
		for(int i=0; i<n; i++) {
			double a=sc.nextDouble();
			count+=a/100;
		}
		count=(count/n)*100;
		System.out.println(count);
		sc.close();
	}

}
