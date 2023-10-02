import java.util.Scanner;

public class TypicalInterviewProblem1796A {

	public static void main(String[] args) {
		Scanner fs = new Scanner(System.in);
		int t = fs.nextInt();
		String s = "FBFFBFFBFBFFBFFBFBFFBFFB";
		for(int i=0;i<t;i++) {
			int n = fs.nextInt();
			String comp = fs.next();
			if(s.contains(comp)) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}

	}

}
