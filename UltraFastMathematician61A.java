import java.util.Scanner;

public class UltraFastMathematician61A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		char [] arr= a.toCharArray();
		char [] brr= b.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=brr[i]) {
				System.out.print(1);
			}
			else {
				System.out.print(0);
			}
			
		}
		System.out.println();
		sc.close();

	}

}
