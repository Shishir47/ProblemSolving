import java.util.Scanner;
public class Multipleiiii {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=1;i<=t;i++){
	        int a,b,c,d,p,q,r,s;
	        a=sc.nextInt();
	        b=sc.nextInt();
	        c=sc.nextInt();
	        d=sc.nextInt();
	        int e = a+b+c;
	        if((e%3)!=0){
	            s = e/3;
	            p = s - a;
	            q = s - b;
	            r = s - c;

	            if(p+q+r == 0){

	                if(p%d==0 && q%d==0 && r%d==0){
	                	System.out.println("Case "+(i+1)+": Peaceful");
	                }else{
	                	System.out.println("Case "+(i+1)+": Fight");
	                }

	            }else{
	            	System.out.println("Case "+(i+1)+": Fight");
	            }

	        }else{
	        	System.out.println("Case "+(i+1)+": Fight");
	        }
	    }
		}
	}