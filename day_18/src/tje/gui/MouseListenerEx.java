package tje.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class MouseListenerEx extends JFrame {

		JLabel la;
		
		public MouseListenerEx() {
			// TODO Auto-generated constructor stub
			setTitle("Mouse 이벤트 예제");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			
			JPanel contentPane = new JPanel();
			setContentPane(contentPane);
			setLayout(null);
			contentPane.addMouseListener(new MyMouseListener());
			
			la = new JLabel("Hello");
			la.setSize(50,20);
			la.setLocation(30,30);
			contentPane.add(la);
			setSize(200,200);
			setVisible(true);
		}
	
		
		class MyMouseListener implements MouseListener{
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				int x = e.getX();
				int y = e.getY();
				la.setLocation(x,y);
			}
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			
		}
		
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MouseListenerEx();
	}

}