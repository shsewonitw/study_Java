package tje.component;

import javax.swing.*;
import java.awt.*;
	

public class TextFieldEx extends JFrame {
	Container contentPane;
	TextFieldEx() {
		setTitle("�ؽ�Ʈ �ʵ� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("�̸�: "));
		contentPane.add(new JTextField(10));
		contentPane.add(new JLabel("�а�: "));
		contentPane.add(new JTextField("xxx ���а�"));
		contentPane.add(new JLabel("�ּ�: "));
		JTextField JT = new JTextField();
		JT.setText("�ȳ��ϼ���Ť�");
		JT.setFont(new Font("���ü",Font.ITALIC,20));
		contentPane.add(JT);
		
		setSize(350,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
