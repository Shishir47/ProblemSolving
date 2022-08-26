package testproj;

import java.util.Scanner;

public class MinCost {

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a,b,c,d,sun,s,sv,fc,m;
		for(int i=0; i<n; i++){
		        a=sc.nextInt();  //total lamps
		        b=sc.nextInt();   //min red lamp
		        c=sc.nextInt();   //red lamp price
		        d=sc.nextInt();    //blue lamp price
		    if(a==b){
		        fc=b*c;
		        System.out.println(fc);
		    }
		    else if(a>b){
		        if(c>d){
		        	s=b*c;
			        sun=a-b;
			        sv=sun*d;
			        System.out.println((s+sv));

		        }
		        else if(d>c){
		        	s=b*c;
			        sun=a-b;
			        sv=sun*c;
			        System.out.println((s+sv));

		        }

		        
		    }
		}

	}

}
