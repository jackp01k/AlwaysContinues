import java.util.ArrayList;

import javax.swing.JFrame;

public class Driver {
	
	
	public static void main(String[] args) {

		//make a new JFrame object because that's what we're learning in zybooks
		JFrame frame = new JFrame("My box");
		

		//from here on out, the program is written in nano. 
		System.out.println("Written by nano!");
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//Write something out just for another commit
		System.out.println("Finished for the day");
	}
	
	

}
