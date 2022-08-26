import java.util.Scanner;

public class MergeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();
		int []array01=new int [n];
		for(int i=0;i<array01.length;i++) {
			array01[i]=sc.nextInt();
		}
		int [] backup= array01;
		for(int i=0; i<array01.length;i++) {
			System.out.print(array01[i]+" ");
		}
		array01= new int[m];
		System.out.println();
		for(int i=0; i<backup.length;i++) {
			array01[i]=backup[i];
		}
		for(int i=0;i<array01.length;i++) {
			array01[i]=sc.nextInt();
		}
		for(int i=0; i<backup.length;i++) {
			System.out.print(backup[i]+" ");
		}
		for(int i=0; i<array01.length;i++) {
			System.out.print(array01[i]+" ");
	
		}

		
sc.close();
	}

}