import java.util.Scanner;
public class RevArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Size: ");
		int az= sc.nextInt();
	int []array= new int [az];
	System.out.print("Enter Array Elements: ");
	for(int i=0; i<array.length;i++) {
		array[i]= sc.nextInt();
	}
	System.out.print("Reversed Array is: ");
	for(int i=array.length-1;i>=0;i-- ) {
		System.out.print(array[i]);
		if(i>0) {
			System.out.print(", ");
		}
		else {
			break;
		}
	}
	sc.close();
	}

}
