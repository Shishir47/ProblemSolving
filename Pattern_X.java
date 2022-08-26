import java.util.Scanner;
public class  Pattern_X{ 
    public static void main(String[] args){
             
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter N : ");
	int n=sc.nextInt();	 
    int k=n*2-1;
    System.out.println();
    for(int i=1;i<=k;i++){
                    
	        for(int j=1;j<=k;j++){      
	        	if(j==i || j==k-i+1)
                System.out.print(i);
                System.out.print(" ");
	        }
		 
    
	 System.out.println();
	    
               }            
                
    }
}