package testproj;
import java.util.Scanner;
import java.lang.Math;

public class Two_Three_Num {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int min=sc.nextInt();
		int max=sc.nextInt();
		int count=0;
		for(int i=min;i<=max;i++ ) {
			if(i%2==0 || i%3==0) {
				
				System.out.println(i);
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}

}
