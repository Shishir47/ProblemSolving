import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hashing {
	static long hash(String pass) {
		long pos=pass.hashCode()%10;
		return pos;
	}
	static long pass(String user) {
		long pos=user.hashCode();
		return pos;
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		long [] arr= new long[10000];
		String user= sc.nextLine();
		String pass=sc.nextLine();

		long pos=hash(pass);
		long passw=pass(user);
		arr[(int) Math.abs(pos)]=passw;
		pass=sc.nextLine();
		long posc=pass.hashCode()%10;
		for(int i=0; i<arr.length; i++) {
			if(arr[(int) Math.abs(posc)]==pass.hashCode()) {
				System.out.println("login");
			}
		}
		

	}

}
