import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class ConTest {
	public static void main(String[] args) {
		Scanner fs= new Scanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		 int t=fs.nextInt();
		    for(int i=0; i<t; i++) {
		        int n=fs.nextInt();
		        LinkedList<Integer> lt= new LinkedList<>();
		        for(int j=0; j<n; j++)
		            lt.add(fs.nextInt());
		        int count = 0;
		        int min = Integer.MAX_VALUE;
		        for (int j=n-1; j>=0; j--) {
		            if (lt.get(j) > min)
		                count++;
		            min=Math.min(min, lt.get(j));
		        }
		        out.println(count);
		    }

		out.close();
		fs.close();

	}

}
