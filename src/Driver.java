import java.util.ArrayList;

import javax.swing.JFrame;

public class Driver {
	
	
	public static void main(String[] args) {

		//make a new JFrame object because that's what we're learning in zybooks
		JFrame frame = new JFrame("My box");
		
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		//legal wildcard
		ArrayList<Object> list1 = new ArrayList<Object>();
		ArrayList<? super Number> list2 = list1;
		
		System.out.println("Written by nano!");
	}
	
	

}
