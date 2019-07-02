package tje.gui;

import javax.swing.*;

import tje.gui.KeyCodeEx.MyKeyListener;

import java.awt.*;
import java.awt.event.*;


public class KeyEventEx extends JFrame {
		
	
	JPanel contentPane = new JPanel();
	JLabel la = new JLabel();
	int x=50,y=50;
	int xMax,yMax;
	public KeyEventEx() {
		setTitle("방향키로 텍스트 움직이기");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setContentPane(contentPane);
		contentPane.setFocusable(true);
		contentPane.setLayout(null);
		contentPane.addKeyListener(new MyKeyListener());
		
		setSize(300,150);
		setVisible(true);
		contentPane.requestFocus();
		la.setText("HELLO");
		la.setLocation(x, y);
		la.setSize(40,10);
		contentPane.add(la);
	}
	
	
	class MyKeyListener extends KeyAdapter {
		@Override
		public void keyPressed(KeyEvent e) {
//			xMax = contentPane.getSize().width;
//			yMax = contentPane.getSize().height;
			xMax = contentPane.getWidth();
			yMax = contentPane.getHeight();
			if((e.getKeyCode() == KeyEvent.VK_UP) && (y>0)) {
				y-=10;
				la.setLocation(x,y);
			}
			else if((e.getKeyCode() == KeyEvent.VK_DOWN) && (y<yMax-10)) {
				y+=10;
				la.setLocation(x,y);
			}
			else if((e.getKeyCode() == KeyEvent.VK_RIGHT) && (x<xMax-40)) {
				x+=10;
				la.setLocation(x,y);

			}
			else if((e.getKeyCode() == KeyEvent.VK_LEFT) && (x>0)) {
				x-=10;
				la.setLocation(x,y);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KeyEventEx();
	}

}
