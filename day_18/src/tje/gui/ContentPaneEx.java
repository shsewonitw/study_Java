package tje.gui;

import javax.swing.*;
import java.awt.*;
public class ContentPaneEx extends JFrame {

	ContentPaneEx() {
		setTitle("ContentPane°ú JFrame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container contentPane = getContentPane();
		contentPane.setBackground(Color.cyan);
		contentPane.setLayout(new FlowLayout());
		contentPane.add(new Button("OK"));
		contentPane.add(new Button("Cancel"));
		contentPane.add(new Button("ignore"));
		
		setSize(350,150);
		setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ContentPaneEx();
	}
}