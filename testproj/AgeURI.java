package testproj;

import java.util.Scanner;

public class AgeURI {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int x;
	System.out.println(n/365+" ano(s)");
	x=n%365;
	System.out.println(x/30+ " mes(es)");
	x=x%30;
	System.out.println(x+ " dia(s)");
sc.close();

	}

}
