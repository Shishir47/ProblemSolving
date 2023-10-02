import java.util.Random;
import java.util.Scanner;

public class Bomber extends Bomb { //Inheritance from Class Bomb

	protected Bomber() {
		Scanner sc= new Scanner (System.in);
		Random rand= new Random();
		int bomb= rand.nextInt(7)+1;
		for(int i=0; i<r ; i++) {
			for(int j=0; j<c; j++) {
				arr[i][j]= rand.nextInt(7)+1;
			}
		}
		System.out.println("Welcome to Maze Game!\nSave from Bomb and Collect Max Points!");
		for(int i=0; i<r ; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(arr[i][j]+" ");
				sum=sum+arr[i][j];
			}
			System.out.println();
		}
		while(done!=true) {
			if(cnt==sum) {
				System.out.println("Congratulations!\nYou Win The Game!\nTotal Points: "+cnt);
				break;
			}
			System.out.print("Select Position: ");
			int f=sc.nextInt();
			if(f==bomb) {
				System.out.println("You Stepped On Bomb!\nGame Over!\nTotal Points: "+cnt);
				break;
			}
			else {
				if(f==1) {
					cnt=cnt + arr[0][0];
					arr[0][0]=0;
				}
				else if(f==2) {
					cnt=cnt + arr[0][1];
					arr[0][1]=0;	
				}
				else if(f==3) {
					cnt=cnt + arr[0][2];
					arr[0][2]=0;
				}
				else if(f==4) {
					cnt=cnt + arr[0][3];
					arr[0][3]=0;
				}
				else if(f==5) {
					cnt=cnt + arr[0][4];
					arr[0][4]=0;
				}
				else if(f==6) {
					cnt=cnt + arr[1][0];
					arr[1][0]=0;
				}
				else if(f==7) {
					cnt=cnt + arr[1][1];
					arr[1][1]=0;
				}
				else if(f==8) {
					cnt=cnt + arr[1][2];
					arr[1][2]=0;
				}
				else if(f==9) {
					cnt=cnt + arr[1][3];
					arr[1][3]=0;
				}
				else if(f==10) {
					cnt=cnt + arr[1][4];
					arr[1][4]=0;
				}
				else if(f==11) {
					cnt=cnt + arr[2][0];
					arr[2][0]=0;
				}
				else if(f==12) {
					cnt=cnt + arr[2][1];
					arr[2][1]=0;
				}
				else if(f==13) {
					cnt=cnt + arr[2][2];
					arr[2][2]=0;
				}
				else if(f==14) {
					cnt=cnt + arr[2][3];
					arr[2][3]=0;
				}
				else if(f==15) {
					cnt=cnt + arr[2][4];
					arr[2][4]=0;
				}
				else if(f==16) {
					cnt=cnt + arr[3][0];
					arr[3][0]=0;
				}
				else if(f==17) {
					cnt=cnt + arr[3][1];
					arr[3][1]=0;
				}
				else if(f==18) {
					cnt=cnt + arr[3][2];
					arr[3][2]=0;
				}
				else if(f==19) {
					cnt=cnt + arr[3][3];
					arr[3][3]=0;
				}
				else if(f==20) {
					cnt=cnt + arr[3][4];
					arr[3][4]=0;
				}
				else if(f==20) {
					cnt=cnt + arr[3][4];
					arr[3][4]=0;
				}
				else if(f==21) {
					cnt=cnt + arr[4][0];
					arr[4][0]=0;
				}
				else if(f==22) {
					cnt=cnt + arr[4][1];
					arr[4][1]=0;
				}
				else if(f==23) {
					cnt=cnt + arr[4][2];
					arr[4][2]=0;
				}
				else if(f==24) {
					cnt=cnt + arr[4][3];
					arr[4][3]=0;
				}
				else if(f==25) {
					cnt=cnt + arr[4][4];
					arr[4][4]=0;
				}
				else {
					System.out.println("Invalid Move!");
				}
				for(int i=0; i<r ; i++) {
					for(int j=0; j<c; j++) {
						System.out.print(arr[i][j]+" ");
					}
					System.out.println();
				}
				System.out.println("Points: "+cnt);
			}
		}	
		sc.close();
	}

}

