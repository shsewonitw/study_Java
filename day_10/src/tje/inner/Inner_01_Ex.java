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
		this.btnPlus = new JButton("더하기");		
		
		// 익명 클래스를 활용한 윈도우 이벤트 처리 방법
		// 이벤트 처리에 복잡한 코드가 포함되지 않는 경우
		// 아래와 같이 간단하게 이벤트를 처리할 수 있는 객체를
		// 생성하여 활용할 수 있습니다.
		// (익명 클래스는 외부의 클래스 모든 멤버에 제한없이 접근할 수 있습니다.)
		// (private 멤버에도 접근이 가능)
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
		
		// 윈도우 프레임의 크기를 설정
		this.setSize(550, 150);
		// 윈도우 프레임을 화면에 출력
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Inner_01_Ex ex = new Inner_01_Ex("인테페이스 예제");

	}
}







