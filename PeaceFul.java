import java.util.Arrays;
import java.util.Scanner;
public class PeaceFul {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int count=0;
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c= sc.nextInt();
			if((a+b+c)%3==0) {
				System.out.println("Case "+(i+1)+": Peaceful");
			}
			else {
				System.out.println("Case "+(i+1)+": Fight");
			}
			
		}
	}

}
