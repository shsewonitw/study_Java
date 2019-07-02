package tje.component2;

import javax.swing.*;
import java.awt.*;

public class ToolTipEx extends JFrame {
	Container contentPane;
	
	ToolTipEx() {
		setTitle("���� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		createToolBar();
		setSize(400,200);
		setVisible(true);
	}
	
	void createToolBar() {
		JToolBar bar = new JToolBar("seokwoo Menu");
		bar.setBackground(Color.LIGHT_GRAY);
		JButton newBtn = new JButton("New");
		newBtn.setToolTipText("������ �����մϴ�.");
		bar.add(newBtn);
		
		JButton openBtn = new JButton(new ImageIcon("open.jpg"));
		openBtn.setToolTipText("������ ���ϴ�.");
		bar.add(openBtn);
		bar.addSeparator();
		
		JButton saveBtn = new JButton("save.jpg");
		saveBtn.setToolTipText("������ �����մϴ�.");
		bar.add(saveBtn);
		
		bar.add(new JLabel("search"));
		
		JTextField tf = new JTextField("text field");
		tf.setToolTipText("ã�����ϴ� ���ڿ��� �Է��ϼ���");
		bar.add(tf);
		contentPane.add(bar,BorderLayout.NORTH);
	}
	
	public static void main(String[] args) {
		new ToolTipEx();
	}
}
