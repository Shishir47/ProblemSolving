import java.util.Scanner;

public class ATram116 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int c=0, cn=0;
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			c=(c+b)-a;
			if(c>cn) {
				cn=c;
			}
		}
		System.out.println(cn);
		sc.close();
		System.gc();
	}

}
