package tje.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComboBoxActionEx extends JFrame {
	Container contentPane;
	String [] fruits = {"apple", "banana", "kiwi", "mango"};
	ImageIcon [] images = {
			new ImageIcon("apple.png"),
			new ImageIcon("banana.png"),
			new ImageIcon("kiwi.jpg"),
			new ImageIcon("mango.jpg")
	};
	JLabel imgLabel = new JLabel(images[0]);
	
	public ComboBoxActionEx() {
		setTitle("콤보박스 Action예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JComboBox strCombo = new JComboBox(fruits);
		strCombo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				JComboBox cb = (JComboBox)e.getSource();
				int index = cb.getSelectedIndex();
				imgLabel.setIcon(images[index]);
			}
		});
		
		contentPane.add(strCombo);
		contentPane.add(imgLabel);
		setSize(300,300);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ComboBoxActionEx();
	}
}

