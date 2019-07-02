package tje.gui;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutEx extends JFrame {
	
	public FlowLayoutEx() {
		setTitle("FlowLayoutEx Sample");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout(FlowLayout.LEFT, 30, 40));
		add(new JButton("add"));
		add(new JButton("sub"));
		add(new JButton("mul"));
		add(new JButton("div"));
		add(new JButton("Calculate"));
		
		setSize(300,250);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayoutEx();
	}

}