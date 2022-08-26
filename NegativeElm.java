import java.util.Scanner;
public class NegativeElm {

	public static void main(String[] args) {
		int i;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.print("Enter Array Size: ");
			int as= sc.nextInt();
			int []array= new int[as];
			System.out.print("Input Array: ");
			for(i=0; i<array.length;i++) {
				array[i]= sc.nextInt();

			}

System.out.println("Output: ");
for(i=0; i<array.length; i++) {
if(array[i]<0) {
			System.out.print(array[i]+" ");

}
			}

sc.close();
		}

	}

}
