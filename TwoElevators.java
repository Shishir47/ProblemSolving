import java.util.Scanner;

public class TwoElevators {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			int x=Math.abs(b-c)+Math.abs(c-1);
			int y=Math.abs(a-1);
			
			if(x>y) {
				System.out.println(1);
			}
			else if(x<y) {
				System.out.println(2);
			}
			else {
				System.out.println(3);
			}
		}

	}

}
