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


// ������ ����� ���� �̺�Ʈ ó�� Ŭ������ ����
/*
class GuGuDanBtnHanddlerOut extends MouseAdapter {
	// �̺�Ʈ ó���� ���� Ŭ������ ��ü�� �̺�Ʈ�� �߻��� �������� �� UI��ҿ� ������ �� �־�� �Ѵ�.
	// �̷��� Ŭ������ ��øŬ������ �ƴ� �Ϲ�Ŭ������ �����ϴ� ���
	// ������ Ŭ������ �� ��ҿ� ������ �Ұ����ϴ�.
	public void mouseClicked(MouseEvent e) {				
		int nN1 = Integer.parseInt(tfN1.getText());
		String s = "<html>";
		for(int i = 1 ; i < 10 ; i++) {
			s +="<br>"+ nN1 + " * " + i + " = " + nN1*i + "      ";
		}
		s += "</html>";
		lbResult.setText(s); 
	}
}
*/


public class Inner_02_Ex extends JFrame{
	
	private JTextField tfN1;
	private JLabel lbResult;
	private JButton btnPlus;
		
	class GuGuDanBtnHanddlerIn extends MouseAdapter {
		// ��ø�� Ŭ������ Ȱ���Ͽ� �̺�Ʈ�� ó���ϴ� ����
		// ������ Ŭ������ ���� Ŭ������ ���ǵǾ��� ������
		// ��� UI ������ҿ� �����Ӱ� ������ �� �ִ�.
		public void mouseClicked(MouseEvent e) {				
			int nN1 = Integer.parseInt(tfN1.getText());
			String s = "<html>";
			for(int i = 1 ; i < 10 ; i++) {
				s +="<br>"+ nN1 + " * " + i + " = " + nN1*i + "      ";
			}
			s += "</html>";
			lbResult.setText(s); 
		}
	}
	
	public Inner_02_Ex(String title) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(title);
		
		this.setLayout(new FlowLayout());
		this.tfN1 = new JTextField(5);
		this.lbResult = new JLabel();
		this.btnPlus = new JButton("������ ���");		
		
		// ��ø�� ���� Ŭ������ ��ü�� ����Ͽ� �̺�Ʈ�� ó���ϴ� ����
		this.btnPlus.addMouseListener(new GuGuDanBtnHanddlerIn());		
		
		this.add(tfN1);
		this.add(lbResult);
		this.add(btnPlus);
		
		// ������ �������� ũ�⸦ ����
		this.setSize(300, 300);
		// ������ �������� ȭ�鿡 ���
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Inner_02_Ex ex = new Inner_02_Ex("�̳�Ŭ���� ����");

	}
}