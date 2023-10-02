import java.util.Scanner;

public class KnapsackBruteForce {

	public static void main(String[] args) {
		
	    int n=3;
	    int wt[]= {5,2,3};
	    int val[]={10,5,6};
	    int x=7;
	    int [][] arr=new int[n][x];
	    for(int i=0;i<n; i++ ){
	        for(int j=0; j<x; j++){
	            if(i==0 || j==0){
	                arr[i][j]=0;
	            }
	            else if(wt[i]<=j){
	                if( (val[i]+arr[i-1][j-wt[i]]) > arr[i-1][j]){
	                       arr[i][j] = (val[i]+arr[i-1][j-wt[i]]);
	                }
	                else{
	                    arr[i][j] = arr[i-1][j];
	                }
	            }

	            else{
	                arr[i][j]=arr[i-1][j];
	            }

	        }
	    }
	    System.out.println("Maximum Value: "+arr[n-1][x-1]);


	}

}
