import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class StonesontheTable266A {

	public static void main(String[] args) throws IOException {
		InputStreamReader r=new InputStreamReader(System.in);   
		BufferedReader br= new BufferedReader(r);
		int s=br.read();
		br.readLine();
		int count=0;
		String sb=br.readLine();
		char [] ch= sb.toCharArray();
		for(int i=0; i<ch.length; i++) {
			if((i+1)<ch.length) {
			if(ch[i]==ch[i+1]) {
				count++;
			}
			}
		}
		System.out.println(count);
		
		br.close();
	}

}
