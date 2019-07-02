

import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Interface_Ex_Calculator extends JFrame implements MouseListener {
	
	private JTextField tfN1;
	private JTextField tfN2;
	private JLabel lbResult;
	private JButton btnPlus;
	
	public void mouseClicked(MouseEvent e) {
		String strN1 = this.tfN1.getText();
		String strN2 = this.tfN2.getText();
		
		int nN1 = Integer.parseInt(strN1);
		int nN2 = Integer.parseInt(strN2);
		
		this.lbResult.setText(nN1 + nN2 + ""); 
	}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}	
	
	public Interface_Ex_Calculator(String title) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(title);
		
		this.setLayout(new FlowLayout());
		
		this.tfN1 = new JTextField(10);
		this.tfN2 = new JTextField(10);
		this.lbResult = new JLabel();
		this.btnPlus = new JButton("더하기");		
		
		this.btnPlus.addMouseListener(this);		
		
		this.add(tfN1);
		this.add(tfN2);
		this.add(lbResult);
		this.add(btnPlus);
		
		// 윈도우 프레임의 크기를 설정
		this.setSize(550, 150);
		// 윈도우 프레임을 화면에 출력
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Interface_Ex_Calculator ex = new Interface_Ex_Calculator("인테페이스 예제");

	}
}







