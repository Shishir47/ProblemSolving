import java.util.Scanner;
public class PetyaAndStrings {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String n=sc.nextLine();
		String m=sc.nextLine();
		n=n.toLowerCase();
		m=m.toLowerCase();
		
		if(n.compareTo(m)==0) {
			System.out.println(0);
		}
		else if(n.compareTo(m)>0) {
			System.out.println(1);
		}
		else if(n.compareTo(m)<0) {
			System.out.println(-1);
		}
		
	}

}
