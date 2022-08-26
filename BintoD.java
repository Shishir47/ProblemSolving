import java.util.Scanner;
public class BintoD {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Binary to Convert: ");
			long num = sc.nextInt();
			long temp=num;
		   int decimalNumber = 0, i = 0;
		    long remainder;
		    
		    while (num != 0) {
		      remainder = num % 10;					// Reminder of num
		       num =num/ 10;						//Num divided by 10
		      decimalNumber += remainder * Math.pow(2, i);  // Binary to Decimal Rule reminder*2^n
		      ++i;
	}
		    System.out.println("Binary to Decimal");
		    System.out.println(temp + " = " + decimalNumber);

  sc.close();
}
}
