import java.util.Scanner;

public class N_Reverse {

	public static void main(String[] args) {
		System.out.print("Input N: ");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		for(int i=n; i>0; i--) {
			System.out.print(i);
			if(i>1) {
				System.out.print(", ");
			}
			else {
				break;
			}
		}	
	sc.close();
	}

}
