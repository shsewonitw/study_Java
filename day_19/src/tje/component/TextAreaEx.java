package tje.component;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TextAreaEx extends JFrame {
	Container contentPane;
	TextAreaEx() {
		setTitle("�ؽ�Ʈ ���� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.add(new MyCenterPanel(),BorderLayout.CENTER);
		setSize(300,300);
		setVisible(true);
	}
	
	class MyCenterPanel extends JPanel {
		JTextField tf;
		JButton btn;
		JTextArea ta;
		MyCenterPanel() {
			tf = new JTextField(20);
			btn = new JButton("�߰�");
			btn.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					ta.append(tf.getText());
					
				}
			});
			ta = new JTextArea("hello",7,20);
			add(new JLabel("�Ʒ� â�� ���ڿ��� �Է��ϰ� ��ư�� Ŭ���ϼ���"));
			add(tf);
			add(btn);
			add(new JScrollPane(ta));
		}
		
	}
	
	public static void main(String[] args) {
		new TextAreaEx();
	}
}
