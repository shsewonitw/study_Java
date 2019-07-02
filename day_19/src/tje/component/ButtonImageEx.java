package tje.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonImageEx extends JFrame {
	Container contentPane;
	public ButtonImageEx() {
		setTitle("버튼에 아이콘 달기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ImageIcon normalIcon = new ImageIcon("normalIcon.png");
		ImageIcon rolloverIcon = new ImageIcon("rolloverIcon.png");
		ImageIcon pressedIcon = new ImageIcon("pressedIcon.png");
		
		JButton btn = new JButton("call~~",normalIcon);
		btn.setRolloverIcon(rolloverIcon);
		btn.setPressedIcon(pressedIcon);
		contentPane.add(btn);
		
		setSize(250,200);
		setVisible(true);
		
	}
	public static void main(String[] args) {
		new ButtonImageEx();
	}
}
