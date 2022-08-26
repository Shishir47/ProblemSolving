package testproj;
import java.util.Scanner;
public class ChatBot {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
		int []a= new int [3];
		int count=0, c2=0;
		//Ascending Order;
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	        
	    }
	    for(int j=0;j<a.length+1;j++) {
	    for(int i=0;i<2;i++){
	        if(a[i+1]>a[i]){
	            System.out.println(a[i]);
	            a[i]=a[i+1];
	            count=a[i];
	            c2=a[i+2];
	        }
	    }
	        
	    }
	    System.out.println(count);
	    System.out.println(c2);

	    sc.close();
	   
	}

}
