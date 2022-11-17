import java.util.Scanner;

public class InSearchofanEasyProblem1030A {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int n=sc.nextInt();
		boolean tr=false;
		for(int i=0; i<n; i++) {
			byte v=sc.nextByte();
			if(v==1) {
				tr=true;
			}

		}
		
		if(tr) {
			System.out.println("HARD");
		}
		else {
			System.out.println("EASY");
		}
		sc.close();
		System.gc();
		
	}

}
