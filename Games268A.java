import java.util.Scanner;

public class Games268A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int [][] total= new int [n][n];
		int count=0;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<2; j++) {
				total[i][j]=sc.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(total[i][0]==total[j][1]) {
					count++;
				}
			}
		}
		System.out.println(count);
		sc.close();
	}

}
