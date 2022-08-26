package testproj;
import java.util.Scanner;
public class SalaryIncrease {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sl= sc.nextDouble();
		if(sl>0 && sl<=2000.00) {
			
			System.out.println("Isento");
		}
		else if(sl>2000 && sl<=3000.00) {
			System.out.printf("R$ %.2f\n", (sl - 2000.00)*0.08);
		}
		else if(sl>3000 && sl<=4500.00) {
			System.out.printf("R$ %.2f\n",((sl - 3000.00)*0.18 + 1000.00*0.08));
		}
		else if(sl>4500) {

			System.out.printf("R$ %.2f\n",((sl-4500)*0.28+(1500*0.18)+(1000*0.08)));
		}
		sc.close();
	}

}
