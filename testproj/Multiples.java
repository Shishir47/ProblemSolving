package testproj;

import java.util.Scanner;

public class Multiples {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		float a=sc.nextFloat(),b=sc.nextFloat(),c=sc.nextFloat(),d;
		d=a;
		if(b>a && b>c) {
		a=b;
		b=d;
		}
		else if(c>a && c>b) {
			a=c;
			c=d;
		}
		if(a>=b+c) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		else if((a*a)==((b*b)+(c*c))) {
			System.out.println("TRIANGULO RETANGULO");
		}
		else if((a*a)>((b*b)+(c*c))) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		else if((a*a)<((b*b)+(c*c))) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if(a==b && b==c && a==c) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		else if(a==b || b==c || a==c) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		
		sc.close();

	}

}
