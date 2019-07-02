

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
	

public class test extends JFrame {
	Container contentPane;
	test() {
		setTitle("텍스트 필드 만들기 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("hh");
		arr.add("bb");
		arr.add("cc");
		Object[] strArr = arr.toArray();
		
		JList list = new JList(strArr);
		list.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				String str = (String)list.getSelectedValue();
				System.out.println(str);
			
			}
			
		});
		contentPane.add(list);
		contentPane.add(new JLabel("이름: "));
		contentPane.add(new JTextField(10));
		contentPane.add(new JLabel("학과: "));
		contentPane.add(new JTextField("xxx 공학과"));
		contentPane.add(new JLabel("주소: "));
		JTextField JT = new JTextField();
		JT.setText("안녕하세요ㅕㅕ");
		JT.setFont(new Font("고딕체",Font.ITALIC,20));
		contentPane.add(JT);
		contentPane.add(list);
		setSize(800,800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new test();
	}
}
