import java.util.Scanner;

public class CalculatingFunction486A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		long t=sc.nextLong();
		long count = 0;
			if(t%2==0) {
				count=t/2;
			}
			else {
				count=-((t+1)/2);
			}
			
	
		
		System.out.println(count);
		
		sc.close();
	}

}
