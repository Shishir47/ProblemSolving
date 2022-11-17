import java.awt.AWTException;
import javax.swing.JOptionPane;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class ASum1742 extends Thread{
	
	static void volumnUp() throws AWTException, InterruptedException {
		Robot robo = new Robot();
        robo.mouseMove(1480, 900);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK );
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(170);
        robo.mouseMove(1532,855);
        robo.mousePress(InputEvent.BUTTON1_DOWN_MASK );
        robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	static void volumnDown() throws AWTException {
		Robot robot = new Robot();

        robot.mouseMove(1480, 900);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK );
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		try {

			Thread.sleep(170);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 robot.mouseMove(1310,855);
	        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK );
	        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	static void exit() throws AWTException, InterruptedException {
		Robot robot = new Robot();
        robot.mouseMove(1480, 0);
        robot.mousePress(InputEvent.BUTTON1_DOWN_MASK );
        robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);

	}
	static void select() throws AWTException, InterruptedException {
		Robot robot=new Robot();
		Thread.sleep(500);
		robot.mouseMove(1370, 234);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_B);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		JOptionPane.showMessageDialog(null,"Hi, Welcome To My App \n1.Full Sound\n2.Mute Sound\n3.Exit\nChoose a Option:");
		Scanner sc= new Scanner(System.in);
		JOptionPane.showInternalMessageDialog(null, "Hello");
		int n=Integer.parseInt(JOptionPane.showInputDialog("Enter your Choice"));
		

		if(n==1) {
			volumnUp();
		}
		else if(n==2) {
			volumnDown();
		}
		else if(n==3) {
			exit();
		}
		Thread.sleep(1500);


		
	}

}
