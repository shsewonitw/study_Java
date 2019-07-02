package tje.component2;

import javax.swing.*;
import java.awt.*;

public class ToolBarEx extends JFrame {
	Container contentPane;
	ToolBarEx() {
		setTitle("툴바 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
		
	}
	
	void createToolBar() {
		JToolBar toolBar = new JToolBar("seokwoo Menu");
		toolBar.setBackground(Color.LIGHT_GRAY);
		toolBar.add(new JButton("New"));
		toolBar.add(new JButton(new ImageIcon("open.jpg")));
		toolBar.addSeparator();
		toolBar.add(new JButton(new ImageIcon("save.jpg")));
		toolBar.add(new JLabel("search"));
		toolBar.add(new JTextField("text field"));
		JComboBox combo = new JComboBox();
		combo.addItem("Java");
		combo.addItem("C#");
		combo.addItem("C");
		combo.addItem("C++");
		toolBar.add(combo);
		contentPane.add(toolBar, BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		new ToolBarEx();
	}
}
