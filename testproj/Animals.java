package testproj;
import java.util.Scanner;
public class Animals {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		char[] r= n.toCharArray();
		int count=0;
		try{for(int i=0;r[i]!='\0';i++) {
			 count++;
			 
		 }
		} catch(IndexOutOfBoundsException e) {
			System.out.println(count);
		}

		sc.close();
	}

}
