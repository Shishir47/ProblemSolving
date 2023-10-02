import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class UVA12015 {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		int t=fs.nextInt();
		for(int i=1; i<=t; i++) {
			LinkedList <String> lt= new LinkedList<>();
			LinkedList <Integer> num= new LinkedList<>();
			LinkedList <Integer> pos= new LinkedList<>();
			for(int j=0; j<10; j++) {
				lt.add(fs.next());
				num.add(fs.nextInt());
			}
			int high=0;
			for(int j=0; j<num.size(); j++) {
				int temp=num.get(j);
				if(temp>high) {
					high=temp;
				}
			}
			for(int j=0; j<num.size(); j++) {
				if(num.get(j)==high) {
					pos.add(j);
				}
			}
			out.println("Case #"+i+":");
			int n=pos.size();
			for(int j=0; j<n; j++) {
				out.println(lt.get(pos.pollFirst()));
			}
			
		}
		fs.close();
		out.close();
		System.gc();

	}

}
