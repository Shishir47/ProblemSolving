package testproj;

import java.util.Scanner;
 
public class Sinking_Ship {
 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		String[] crew = new String[n];
		for(int i = 0; i < n; i++) {
			crew[i] = sc.nextLine();
		}
 
		for(int i = 0; i < n; i++) {
			String[] member = crew[i].split(" ");
			if(member[1].equals("rat")) {
				System.out.println(member[0]);
			}
		}
 
		for(int i = 0; i < n; i++) {
			String[] member = crew[i].split(" ");
			if(member[1].equals("woman") || member[1].equals("child")) {
				System.out.println(member[0]);
			}
		}
 
		for(int i = 0; i < n; i++) {
			String[] member = crew[i].split(" ");
			if(member[1].equals("man")) {
				System.out.println(member[0]);
			}
		}
 
		for(int i = 0; i < n; i++) {
			String[] member = crew[i].split(" ");
			if(member[1].equals("captain")) {
				System.out.println(member[0]);
				break;
			}
		}
		sc.close();
	}
 
}
 
	