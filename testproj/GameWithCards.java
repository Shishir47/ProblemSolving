package testproj;
import java.util.Scanner;
public class GameWithCards {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t_cases=sc.nextInt();
		int count_a=0;
		int count_b=0;
		int first_player = 0;
		for(int i=0; i<t_cases;i++) {
		if(first_player==0) {

			int alice=sc.nextInt();
			int[] alice_c= new int[alice];
			for(int j=0; j<alice; j++) {
			alice_c[j]=sc.nextInt();
			}
			int bob=sc.nextInt();
			int[] bob_c= new int [bob];
			for(int b=0; b<bob; b++) {
				bob_c[b]=sc.nextInt();
				
				}
			for(int j=0; j<alice; j++) {
			for(int b=0; b<bob; b++) {
			if(alice_c==bob_c && bob_c==alice_c) {
				if(bob_c[b]==alice_c[j])
				System.out.println("Alice");
				first_player=0;
			}
			else
				count_b++;
	}
		}
			if(bob>alice) {
	if(count_b>count_a) {
		System.out.println("Bob");
		first_player=1;
	}
	else {
		System.out.println("Alice");
		first_player=0;
	}
	}
			else {
				System.out.println("Alice");
				first_player=0;
			}
		
	}
		System.out.println(first_player);
		if(first_player==1){
			int bob=sc.nextInt();
			int[] bob_c= new int[bob];
			for(int j=0; j<bob; j++) {
			bob_c[j]=sc.nextInt();
			}
			int alice=sc.nextInt();
			int[] alice_c= new int [alice];
			for(int b=0; b<alice; b++) {
				alice_c[b]=sc.nextInt();
				
				}
			for(int j=0; j<bob; j++) {
			for(int b=0; b<alice; b++) {
			if(alice_c==bob_c && bob_c==alice_c) {
				if(alice_c[b]==bob_c[j])
				System.out.println("Bob");
				first_player=1;
			}
			else
				count_a++;
	}
		}
			if(alice>bob) {
	if(count_a>count_b) {
		System.out.println("Alice");
		first_player=0;
	}
	else {
		System.out.println("Bob");
		first_player=1;
	}
	}
			else {
				System.out.println("Bob");	
				first_player=1;
			}
	}
		}
		sc.close();
}
}
