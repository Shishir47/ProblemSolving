import java.util.HashSet;
import java.util.Scanner;

public class IWannaBetheGuy469A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashSet<Integer> hs= new HashSet<Integer>();
		int n=sc.nextInt();
		int c=sc.nextInt();
		for(int i=0; i<c; i++) {
		hs.add(sc.nextInt());
		}
		int d=sc.nextInt();
		for(int i=0; i<d; i++) {
		hs.add(sc.nextInt());
		}
		if(n==hs.size()) {
			System.out.println("I become the guy.");
		}
		else {
			System.out.println("Oh, my keyboard!");
		}
		sc.close();

	}

}
