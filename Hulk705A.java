import java.util.Scanner;

public class Hulk705A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String h="I hate that ";
		String s="I love that ";
		for(int i=1; i<n; i++) {
			if(i%2==0) {
				System.out.print(s);
			}
			else {
				System.out.print(h);
			}
		}
		if(n%2==0) {
			System.out.println("I love it");
		}
		else {
			System.out.println("I hate it");
		}
		sc.close();
	}

}
