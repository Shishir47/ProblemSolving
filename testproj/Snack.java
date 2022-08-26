package testproj;

import java.util.Scanner;

public class Snack {
//uva
	public static void main(String[] args) {
		 
		Scanner sc= new Scanner(System.in);
		float n= sc.nextFloat();
		float n1= sc.nextFloat();
		float n2= sc.nextFloat();
		float n3= sc.nextFloat();
		float avg= ((n*2)+(n1*3)+(n2*4)+n3)/(2+3+4+1);
		System.out.printf("Media: %.1f\n",avg);
		if(avg>=7.0) {
			System.out.println("Aluno aprovado.");
		}
		else if(avg>=5.0) {
		System.out.println("Aluno em exame.");
		float n4=sc.nextFloat();
		System.out.printf("Nota do exame: %.1f\n",n4);
		avg=(avg+n4)/2;
		if(avg>5.0) {
			System.out.println("Aluno aprovado.");
			
		}
		else {
			System.out.println("Aluno reprovado.");
		}
		System.out.printf("Media final: %.1f\n",avg);
		
	}
	else {
		System.out.println("Aluno reprovado.");
	}

sc.close();
	}

}
