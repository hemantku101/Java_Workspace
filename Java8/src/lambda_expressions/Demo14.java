//Write a java program to display a message when a push button is clicked using lambda expression

//in this program push button works with lambda expression - version 2

package lambda_expressions;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo14 {
	public static void main(String args[]) {
		//create a push button with label
		JButton but = new JButton("Click this button");
		
		//here, we jre passing lambda expression to
		//addActionListener() method
		but.addActionListener(e ->{ System.out.println("Lambda expression demo");
		});
		
		//create frame
		JFrame f = new JFrame("Understanding lambda expression");
		
		//add button frame
		f.add(but);
		
		//set the size of the frame
		f.setSize(500, 350);
		
		//display the frame
		f.setVisible(true);
		
		//close the frame when close button of frame is clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}