package tje.inner;

import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


// 사용자에게 정수값 하나를 입력받을 수 있는  UI화면을 구현하세요.
// JButton을 활용하여 클릭 이벤트가 발생하는 경우
// JTextField 타입에 입력된 정수를 이용하여 
// 구구단을 화면에 출력하세요(JLabel을 활용)
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
		this.btnPlus = new JButton("구구단 출력");		
		
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
		
		// 윈도우 프레임의 크기를 설정
		this.setSize(300, 300);
		// 윈도우 프레임을 화면에 출력
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Inner_01_Ex_02 ex = new Inner_01_Ex_02("이너클래스 예제");

	}
}