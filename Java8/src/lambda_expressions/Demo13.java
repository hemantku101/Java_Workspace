//Write a java program to display a message when a push button is clicked using anonymous inner class

package lambda_expressions;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo13 {
	public static void main(String args[]) {
		//create a push button with label
		JButton but = new JButton("Click this button");
		
		//here, we are passing anonymous inner class object to
		//addActionListener() method
		but.addActionListener(new ActionListener()
				{
			public void actionPerformed(ActionEvent ae) {
				System.out.println("Anonymous inner class demo");
			}
				});
		
		//create frame
		JFrame f = new JFrame("Understanding lambda expressions");
		
		//add button to the frame
		f.add(but);
		
		//display the frame
		f.setVisible(true);
		
		//close the frame when close button of frame is clicked
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}