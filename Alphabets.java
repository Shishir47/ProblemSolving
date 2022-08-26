
public class Alphabets {

	public static void main(String[] args) {
		System.out.println("All Alphabets in upper-case: ");
		for(char alp='A'; alp<='Z'; alp++) {
			System.out.print(alp);
			if(alp<'Z') {
				System.out.print(", ");
			}
			else {
				break;
			}
		}
		System.out.println("\n\nAll Alphabets in lower-case: ");
		for(char alp='a'; alp<='z'; alp++) {
			System.out.print(alp);
			if(alp<'z') {
				System.out.print(", ");
			}
			else {
				break;
			}
		}

	}

}
