package tje.component;

import javax.swing.*;
import java.awt.*;
	

public class TextFieldEx extends JFrame {
	Container contentPane;
	TextFieldEx() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		contentPane.add(new JLabel("이름: "));
		contentPane.add(new JTextField(10));
		contentPane.add(new JLabel("학과: "));
		contentPane.add(new JTextField("xxx 공학과"));
		contentPane.add(new JLabel("주소: "));
		JTextField JT = new JTextField();
		JT.setText("안녕하세요ㅕㅕ");
		JT.setFont(new Font("고딕체",Font.ITALIC,20));
		contentPane.add(JT);
		
		setSize(350,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new TextFieldEx();
	}
}
