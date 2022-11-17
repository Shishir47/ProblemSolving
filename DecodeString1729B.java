import java.util.Scanner;

public class DecodeString1729B {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String src=" ";
		System.out.println("Enter List Size: ");
		int n=sc.nextInt();
		String [] arr= new String [n];
		System.out.println("Enter "+n+ " Items: ");
		for(int i=0; i<arr.length; i++) {
			arr[i]=sc.next();
		}
		System.out.println("Enter Search Items: ");
		while(src.compareTo("Stop")!=0) {
		src= sc.next();
		int temp=0;
		boolean found=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].compareTo(src)==0) {
				temp=i;
				found=true;
				break;
			}
		}
		if(found) {
			System.out.println(src+" Found at Index: "+temp);
		}
		else {
			System.out.println(src+" Not Found!");
		}
		}
		sc.close();
		System.gc();
	}

}
