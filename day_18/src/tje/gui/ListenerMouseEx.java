package tje.gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class ListenerMouseEx extends JFrame{
	public ListenerMouseEx() {
		// TODO Auto-generated constructor stub
		setTitle("버튼에 mouse 이벤트 리스너 작성");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton btn = new JButton("Mouse Event 테스트 버튼");
		btn.setBackground(Color.YELLOW);
		MyMouseListener listener = new MyMouseListener();
		btn.addMouseListener(listener);
		add(btn);
		setSize(300,150);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new ListenerMouseEx();
		
	}

}

class MyMouseListener implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.RED);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		JButton b = (JButton)e.getSource();
		b.setBackground(Color.YELLOW);
	}
	
}