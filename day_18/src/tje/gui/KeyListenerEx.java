package tje.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class KeyListenerEx extends JFrame {
	JPanel contentPane = new JPanel();
	JLabel [] keyMessage;
	
	public KeyListenerEx() {
		setTitle("KeyListener ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setContentPane(contentPane);
		contentPane.addKeyListener(new MyKeyListener());
		keyMessage = new JLabel [3];
		keyMessage[0] = new JLabel("  getKeyCode()  ");
		keyMessage[1] = new JLabel("  getKeyChar()  ");
		keyMessage[2] = new JLabel("  getKeyText()  ");

		for(int i=0; i<keyMessage.length; i++) {
			contentPane.add(keyMessage[i]);
			keyMessage[i].setOpaque(true);
			keyMessage[i].setBackground(Color.CYAN);
		}
		contentPane.setFocusable(true);
		setSize(300,150);
		setVisible(true);
		contentPane.requestFocus();

	}

class MyKeyListener extends KeyAdapter {
		public void keyPressed(KeyEvent e) {
			int keyCode = e.getKeyCode();
			char keyChar = e.getKeyChar();
			keyMessage[0].setText(Integer.toString(keyCode));
			keyMessage[1].setText(Character.toString(keyChar));
			keyMessage[2].setText(e.getKeyText(keyCode));
		}	
	}

	public static void main(String [] args) {
		new KeyListenerEx();
	}


}
