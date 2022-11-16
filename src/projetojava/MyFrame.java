package projetojava;

import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MyFrame extends JFrame {

	public MyFrame() {
		
		super ("My Events");
		
		JButton button = new JButton("Click");
		
		getContentPane().add(button);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new MyFrame();
	}
}

	
