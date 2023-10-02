public class KnapsackDP {
	
	static int max(int a, int b){ 
    	return (a > b) ? a : b; 
	}
	
    static int knapSack(int W, int wt[], int val[], int n){
        if (n == 0 || W == 0)
            return 0;

        if (wt[n - 1] > W)
            return knapSack(W, wt, val, n - 1);
 
        else
            return max(val[n - 1]+knapSack(W - wt[n - 1], wt,val, n - 1),knapSack(W, wt, val, n - 1));  
    }
    public static void main(String args[]){
        int val[] = {1,2,3,4,5,6,7,8,9,10};
        int wt[] = {1,2,3,4,5,6,7,8,9,10};
        int W = 4;
        int n = 2;
        System.out.println("Maximum Value is: "+knapSack(W, wt, val, n));
    }
}