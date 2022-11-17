import java.util.Scanner;
public class BeautifulMatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int [][] mat= new int [5][5];
		int count=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				mat[i][j]=sc.nextInt();
				if(mat[i][j]==1) {
					count=Math.abs(i-2)+Math.abs(j-2);
					
				}
				
			}
		}
		System.out.println(count);

	}

}
