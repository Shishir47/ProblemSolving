import java.util.Scanner;

public class AAntonandDanik734 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		sc.nextInt();
		int c=0,d=0;
		sc.nextLine();
		String s= sc.nextLine();
		char [] arr= s.toCharArray();
		for(int i=0; i<arr.length; i++) {
			if(arr[i]=='A') {
				c++;
			}
			else if(arr[i]=='D') {
				d++;
			}
		}
		if(c>d) {
			System.out.println("Anton");
		}
		else if(c<d) {
			System.out.println("Danik");
		}
		else if(c==d) {
			System.out.println("Friendship");
		}
		sc.close();
		System.gc();
	}

}
