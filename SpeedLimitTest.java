import java.util.Scanner;

public class SpeedLimitTest {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			double a=sc.nextInt();
			double b=sc.nextInt();
			double c=sc.nextInt();
			double d=sc.nextInt();
			if((a/b)<(c/d)) {
				System.out.println("Bob");
			}
			else if((a/b)>(c/d)) {
				System.out.println("Alice");
			}
			else if((a/b)==(c/d)) {
				System.out.println("Equal");
			}
		}

	}

}
