import java.util.Scanner;

public class Walktober{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0; i<t; i++) {
			int r=sc.nextInt();
			int c=sc.nextInt();
			int p=sc.nextInt();
			int[] [] arr= new int [r][c];
			for(int j=0; j<r; j++) {
				for(int k=0; k<c; k++) {
					arr[j][k]=sc.nextInt();
				}
			}
			int count=0;
			int [] jar= new int[c];
			int [] big= new int[c];
			for(int g=0; g<c; g++) {
				big[g]=0;
			}
			
			for(int j=0; j<c; j++) {
				jar[j]=arr[p-1][j];
			}
			for(int j=0; j<r; j++) {
				for(int k=0; k<c; k++) {
					if(arr[j][k]>big[k]) {
						big[k]=arr[j][k];
					}
				}
			}
			for(int j=0; j<c; j++) {
					if((big[j]-jar[j])>0) {
							count=count+big[j]-jar[j];
					}
			}
			System.out.println("Case #"+(i+1)+": "+count);
		}
		sc.close();
	}

}
