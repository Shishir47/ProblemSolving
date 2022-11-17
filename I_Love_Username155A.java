import java.util.Scanner;

public class I_Love_Username155A {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt(),min, max,mx=0,amz=0;
		mx=sc.nextInt();
		min=mx;
		max=mx;
		for(int i=1; i<n; i++) {
			mx=sc.nextInt();
			if(mx<min) {
				min=mx;
				amz++;
			}
			if(mx>max){
				max=mx;
				amz++;
			}
		}
		System.out.println(amz);
		sc.close();
	}

}
