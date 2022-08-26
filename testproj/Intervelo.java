package testproj;
import java.util.Scanner;
public class Intervelo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
		double r1=(-b+Math.sqrt(b*b-(4*a*c)))/(2*a);
		double r2=(-b-Math.sqrt(b*b-(4*a*c)))/(2*a);
		if(a==0 || (b*b-(4*a*c))<0) {
			System.out.println("Impossivel calcular");
		}
		else {
		System.out.printf("R1 = %.5f",r1);
		System.out.println();
		System.out.printf("R2 = %.5f",r2);
		System.out.println();
		}
		sc.close();
	}

}
