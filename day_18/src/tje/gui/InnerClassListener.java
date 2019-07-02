package tje.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InnerClassListener extends JFrame {
	JButton btn = new JButton("Action");
	public InnerClassListener() {
		// TODO Auto-generated constructor stub
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(btn.getText().equals("Action"))
					btn.setText("액션");
				else
					btn.setText("Action");
				
				// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
				setTitle(btn.getText());
			}
		});
		add(btn);
	}
	
//	private class MyActionListener implements ActionListener {
//		@Override
//		public void actionPerformed(ActionEvent e) {
//			// TODO Auto-generated method stub
//			// InnerClassListener 의 멤버나 JFrame의 멤버를 호출할 수 있음
//			if(btn.getText().equals("Action"))
//				btn.setText("액션");
//			else
//				btn.setText("Action");
//			
//			// InnerClassListener의 멤버나 JFrame의 멤버를 호출할 수 있음
//			setTitle(btn.getText());
//		}
//	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClassListener();
	}
}
