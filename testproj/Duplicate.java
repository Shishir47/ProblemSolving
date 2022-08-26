package testproj;

import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<num; i++) {
			int f=sc.nextInt();
			for(int j=0; j<num;j++) {
				int v=sc.nextInt();
				 for (int h = 0; h< j; h++) {
				     for (int m = h + 1; m < j; m++) {
				          if (h==m) {
				            System.out.println(h);
				          }
				     }
				 }
			}
		}
		sc.close();

	}

}
