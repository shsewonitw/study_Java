package tje.inner;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Inner_01_Ex extends JFrame{
	
	private JTextField tfN1;
	private JTextField tfN2;
	private JLabel lbResult;
	private JButton btnPlus;
		
	public Inner_01_Ex(String title) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(title);
		
		this.setLayout(new FlowLayout());
		this.tfN1 = new JTextField(10);
		this.tfN2 = new JTextField(10);
		this.lbResult = new JLabel();
		this.btnPlus = new JButton("���ϱ�");		
		
		// �͸� Ŭ������ Ȱ���� ������ �̺�Ʈ ó�� ���
		// �̺�Ʈ ó���� ������ �ڵ尡 ���Ե��� �ʴ� ���
		// �Ʒ��� ���� �����ϰ� �̺�Ʈ�� ó���� �� �ִ� ��ü��
		// �����Ͽ� Ȱ���� �� �ֽ��ϴ�.
		// (�͸� Ŭ������ �ܺ��� Ŭ���� ��� ����� ���Ѿ��� ������ �� �ֽ��ϴ�.)
		// (private ������� ������ ����)
		this.btnPlus.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {				
				int nN1 = Integer.parseInt(tfN1.getText());
				int nN2 = Integer.parseInt(tfN2.getText());
				
				lbResult.setText(nN1 + nN2 + ""); 
			}
		});		
		
		this.add(tfN1);
		this.add(tfN2);
		this.add(lbResult);
		this.add(btnPlus);
		
		// ������ �������� ũ�⸦ ����
		this.setSize(550, 150);
		// ������ �������� ȭ�鿡 ���
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Inner_01_Ex ex = new Inner_01_Ex("�������̽� ����");

	}
}







