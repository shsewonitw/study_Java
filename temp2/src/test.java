

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
	

public class test extends JFrame {
	Container contentPane;
	test() {
		setTitle("�ؽ�Ʈ �ʵ� ����� ����");
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
		contentPane.add(new JLabel("�̸�: "));
		contentPane.add(new JTextField(10));
		contentPane.add(new JLabel("�а�: "));
		contentPane.add(new JTextField("xxx ���а�"));
		contentPane.add(new JLabel("�ּ�: "));
		JTextField JT = new JTextField();
		JT.setText("�ȳ��ϼ���Ť�");
		JT.setFont(new Font("���ü",Font.ITALIC,20));
		contentPane.add(JT);
		contentPane.add(list);
		setSize(800,800);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new test();
	}
}
