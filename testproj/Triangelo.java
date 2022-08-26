package testproj;

import java.util.Scanner;

public class Triangelo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble(),b=sc.nextDouble(),c=sc.nextDouble();
		if(a+b<=c || a + c <= b || b + c <= a) {
			System.out.println("Area = "+((a+b)*c)/2);
		}
		else {
			System.out.println("Perimetro = "+(a+b+c));
		}
		sc.close();
	}

}
