import java.util.Random;
import java.util.Scanner;
public class MatrixMulti {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Row: ");
		int row=sc.nextInt();
		System.out.print("Enter Column: ");
		int col=sc.nextInt();
		int [][] matrix1= new int[row][col];
		int [][] matrix2= new int[row][col];
		int [][] matrix3= new int[row][col];
		Random random= new Random();
		for(int i=0; i<row;i++) {
			for(int j=0; j<col; j++) {
				matrix1[i][j]=random.nextInt(10);
			}
		}
		for(int i=0; i<row;i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix1[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0; i<row;i++) {
			for(int j=0;j<col;j++ ) {
			matrix2[i][j]=random.nextInt(10);
		}
		}
		System.out.println();
		for(int i=0; i<row;i++) {
			for(int j=0; j<col; j++) {
				System.out.print(matrix2[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				for(int k=0;k<col;k++) {
					matrix3[i][j]+= matrix1[i][k]*matrix2[k][j];
				}
				System.out.print(matrix3[i][j]+"\t");
			}
			System.out.println();
		}
sc.close();
	}

}
