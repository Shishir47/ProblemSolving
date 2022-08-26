import java.util.Scanner;
public class DeleteAElm {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Array Length: ");
		int as=sc.nextInt();
			int []array=new int [as];
			System.out.print("Enter Array Elements: ");
			for(int i=0; i<array.length;i++) {
			array[i]= sc.nextInt();	
			
			}
			System.out.print("Enter Position to Remove: ");
			int z= sc.nextInt();
			for(int i=0;i<array.length;i++) {
				if(i==z-1) {
					continue;
				}
				System.out.print(array[i]);
				if(i<array.length-1) {
					System.out.print(", ");
				}
				else {
					break;
				}
			}

sc.close();
	}

}
