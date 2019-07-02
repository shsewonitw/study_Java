package tje.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ListenerSample extends JFrame {

	public ListenerSample() {
		// TODO Auto-generated constructor stub
		setTitle("Action 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Action");
		MyActionListener listener = new MyActionListener();
		btn.addActionListener(listener);
		add(btn);
		setSize(300,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ListenerSample();
	}

}

class MyActionListener implements ActionListener {
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("Action")) {
			b.setText("액션");
		} else {
			b.setText("Action");
		}
	}
}