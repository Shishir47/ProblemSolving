import java.util.Scanner;

public class BobBank {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int w=sc.nextInt();
			int x=sc.nextInt();
			int y=sc.nextInt();
			int z=sc.nextInt();
			System.out.println(w+((x-y)*z));
		}

	}

}
