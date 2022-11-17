package testproj;

import java.util.Scanner;

public class AbnormalWords {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		char c=sc.nextLine().charAt(0);
		int x= sc.nextInt();
		sc.nextLine();
		String f= sc.nextLine();
		char [] arr= f.toCharArray();
		if(c=='E') {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]+x>122 ) {
					System.out.print((char)((arr[i]+x)-26));
				}
				else {
					System.out.print((char)(arr[i]+x));
				}
			}
		}
		else {
			for(int i=0; i<arr.length; i++) {
				if(arr[i]-x<97) {
					System.out.print((char)((arr[i]-x)+26));
					
				}
				else{
					System.out.print((char)(arr[i]-x));
				}
			}
		}

	}

}
