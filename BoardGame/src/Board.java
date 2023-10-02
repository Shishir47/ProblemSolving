import java.util.*;
public class Board {
	public static void main(String[]args) {
		int [][] board;
		int row,col,over = 0, player=5;
		Scanner sc= new Scanner(System.in);
		Random rand= new Random();
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Welcome "+name+" to Maze Game!");
		System.out.println("Enter the Dimention: ");
		row= col= sc.nextInt();
		board= new int [row+2][col+2];
		for(int i=0;i<row+2;i++) {
			for(int j=0;j<col+2;j++) {
				if(i == 0 || i == row+1 || j == 0 || j==col+1) {
					board[i][j] = 1;
				}
				else {
					board[i][j] = rand.nextInt(2);
					
				}
			}
		}
		int ranRow=rand.nextInt(1,row), ranCol=rand.nextInt(1,col);
		board[ranRow][ranCol] = player;
		try{
			do {
				for(int i = 0; i < row+2; i++) {
					for(int j = 0; j < col+2; j++) {
						System.out.print(board[i][j]+" ");
					}
					System.out.println();
				}
				if(board[ranRow+1][ranCol]== 1 && board[ranRow][ranCol+1]== 1 && board[ranRow-1][ranCol]== 1 && board[ranRow][ranCol-1]== 1) {
					System.out.println("Game Over!");
					over=1;
				}
				else {

					if(board[ranRow+1][ranCol]==0 ) {
						System.out.println("Enter 1 to Move Down!");
					}
					if(board[ranRow][ranCol+1]==0 ) {
						System.out.println("Enter 2 to Move Right!");
					}
					if(board[ranRow-1][ranCol]==0 ) {
						System.out.println("Enter 3 to Move Up!");
					}
		
					if(board[ranRow][ranCol-1]==0 ) {
						System.out.println("Enter 4 to Move Left!");
					}
					System.out.print("Move: ");
					int h=sc.nextInt();
					if(h==1 && board[ranRow+1][ranCol]==0) {
						board[ranRow+1][ranCol]=player;
						board[ranRow][ranCol]=1;
						ranRow=ranRow+1;
					}
					else if(h==2 && board[ranRow][ranCol+1]==0) {
						board[ranRow][ranCol+1]=player;
						board[ranRow][ranCol]=1;
						ranCol=ranCol+1;
					}
					else if(h==3 && board[ranRow-1][ranCol]==0) {
						board[ranRow-1][ranCol]=player;
						board[ranRow][ranCol]=1;
						ranRow=ranRow-1;
					}
					else if(h==4 && board[ranRow][ranCol-1]==0) {
						board[ranRow][ranCol-1]=player;
						board[ranRow][ranCol]=1;
						ranCol=ranCol-1;
					}
					else {
						System.out.println("Wrong Move!");
					}

				}
			}	while(over!=1);
		} 	catch(IndexOutOfBoundsException e) {
				System.out.println("Invalid Move! \nGame Over!");
				sc.close();
			}
	}
}
