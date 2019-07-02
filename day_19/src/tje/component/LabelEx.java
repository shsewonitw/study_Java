package tje.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LabelEx extends JFrame {
	Container contentPane;
	LabelEx(){
		setTitle("���̺���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel textLabel = new JLabel("����մϴ�.");
		ImageIcon beauty = new ImageIcon("heart.jpg");
		JLabel imageLabel = new JLabel(beauty);
		ImageIcon normalIcon = new ImageIcon("telephone.jpg");
		JLabel label = new JLabel("��������� ��ȭ�ϼ���",normalIcon,SwingConstants.CENTER);
		contentPane.add(textLabel);
		contentPane.add(imageLabel);
		contentPane.add(label);
		
		
		setSize(400,600);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new LabelEx();

	}
 
}
