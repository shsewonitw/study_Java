package tje.gui;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutEx extends JFrame{
	public BorderLayoutEx() {
		// TODO Auto-generated constructor stub
		setTitle("Border Layout Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout(20,20));
		add(new JButton("add"),BorderLayout.NORTH);
		add(new JButton("sub"),BorderLayout.SOUTH);
		add(new JButton("mul"),BorderLayout.EAST);
		add(new JButton("div"),BorderLayout.WEST);
		add(new JButton("Calculate"),BorderLayout.CENTER);
		
		setSize(300,200);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		
		new BorderLayoutEx();

	}

}