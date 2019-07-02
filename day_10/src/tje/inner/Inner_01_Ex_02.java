package tje.inner;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


// ����ڿ��� ������ �ϳ��� �Է¹��� �� �ִ�  UIȭ���� �����ϼ���.
// JButton�� Ȱ���Ͽ� Ŭ�� �̺�Ʈ�� �߻��ϴ� ���
// JTextField Ÿ�Կ� �Էµ� ������ �̿��Ͽ� 
// �������� ȭ�鿡 ����ϼ���(JLabel�� Ȱ��)
public class Inner_01_Ex_02 extends JFrame{
	
	private JTextField tfN1;
	private JLabel lbResult;
	private JButton btnPlus;
		
	public Inner_01_Ex_02(String title) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(title);
		
		this.setLayout(new FlowLayout());
		this.tfN1 = new JTextField(5);
		this.lbResult = new JLabel();
		this.btnPlus = new JButton("������ ���");		
		
		this.btnPlus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				int nN1 = Integer.parseInt(tfN1.getText());
				String s = "<html>";
				for(int i = 1 ; i < 10 ; i++) {
					s +="<br>"+ nN1 + " * " + i + " = " + nN1*i + "      ";
				}
				s += "</html>";
				lbResult.setText(s); 
			}
		});		
		
		this.add(tfN1);
		this.add(lbResult);
		this.add(btnPlus);
		
		// ������ �������� ũ�⸦ ����
		this.setSize(300, 300);
		// ������ �������� ȭ�鿡 ���
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Inner_01_Ex_02 ex = new Inner_01_Ex_02("�̳�Ŭ���� ����");

	}
}