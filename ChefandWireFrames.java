import java.util.Scanner;
public class ChefandWireFrames {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		int tot=0;
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c=sc.nextInt();
			tot=((a*2)+(b*2))*c;
			System.out.println(tot);
		}

	}

}
