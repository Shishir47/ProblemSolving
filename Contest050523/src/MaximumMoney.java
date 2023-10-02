import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MaximumMoney {
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

    public static void main(String[] args) {
        FastScanner fs= new FastScanner();
        PrintWriter out= new PrintWriter(System.out);
        int t=fs.nextInt();
        while(t-->0) {
            int n=fs.nextInt();
            int val[] = new int [n];
            int wt[] = new int [n];
            int W = fs.nextInt();
            for(int i=0; i<n; i++) {
                int x=fs.nextInt();
                val[i]=x;
                wt[i]=x;
            }
            out.println(knapSack(W, wt, val, n));
        }
        out.close();
        System.gc();
    }
    static class FastScanner{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer("");
        String next() {
            while(!st.hasMoreTokens()) {
                try {
                    st=new StringTokenizer(br.readLine());
                }
                catch(IOException e) {
                    e.printStackTrace();
                }
                
            }
            return st.nextToken();
        }
        int nextInt() {
            return Integer.parseInt(next());
        }
        long nextLong() {
            return Long.parseLong(next());
        }
        String nextL() throws IOException{
            return br.readLine();
        }
        double nextD() {
            return Double.parseDouble(next());
        }
        
    }

}
