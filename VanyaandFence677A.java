import java.util.Scanner;

public class VanyaandFence677A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int h=sc.nextInt();
		int count=0;
		for(int i=0; i<n; i++) {
			int v=sc.nextInt();
			if(v>h) {
				count=count+2;
			}
			else {
				count=count+1;
			}
		}
		System.out.println(count);
		sc.close();
		System.gc();
	}

}
