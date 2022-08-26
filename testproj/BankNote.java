package testproj;
import java.util.Scanner;
public class BankNote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat();
		
		int h=(int) (a/100);
		int fi=(int) (a%100/50);
		int tw=(int) (a%100)%50/20;
		int te=(int) (a%100)%50%20/10;
		int fiv=(int) (a%100)%50%20%10/5;
		int two=(int) (a%100)%50%20%10%5/2;
		int one=(int) (a%100)%50%20%10%5%2/1;
		int remain= (int) (a*100);
		remain=remain%100;
		int half=(int) ((int) (remain/50));
		int quarter=(int) ((int) (remain%50/25));
		int ten=(int) ((int) (remain%50%25/10));
		int five=(int) ((int) (remain%50%25%10/5));
		int oneo=(int) ((int) (remain%50%25%10%5/1));
		
		System.out.println("NOTAS:");
		System.out.printf("%d nota(s) de R$ 100.00\n", h);
		System.out.printf("%d nota(s) de R$ 50.00\n", fi);
		System.out.printf("%d nota(s) de R$ 20.00\n", tw);
		System.out.printf("%d nota(s) de R$ 10.00\n", te);
		System.out.printf("%d nota(s) de R$ 5.00\n", fiv);
		System.out.printf("%d nota(s) de R$ 2.00\n", two);
		
		
		System.out.println("MOEDAS:");
		System.out.printf("%d moeda(s) de R$ 1.00\n", one);
		System.out.printf("%d moeda(s) de R$ 0.50\n", half);
		System.out.printf("%d moeda(s) de R$ 0.25\n", quarter);
		System.out.printf("%d moeda(s) de R$ 0.10\n", ten);
		System.out.printf("%d moeda(s) de R$ 0.05\n", five);
		System.out.printf("%d moeda(s) de R$ 0.01\n", oneo);
sc.close();
	}

}
