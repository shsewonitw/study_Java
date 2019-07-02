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


// 구구단 출력을 위한 이벤트 처리 클래스의 선언
/*
class GuGuDanBtnHanddlerOut extends MouseAdapter {
	// 이벤트 처리를 위한 클래스의 객체는 이벤트가 발생된 윈도우의 각 UI요소에 접근할 수 있어야 한다.
	// 이러한 클래스를 중첩클래스가 아닌 일반클래스로 정의하는 경우
	// 윈도우 클래스의 각 요소에 접근이 불가능하다.
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
		// 중첩된 클래스를 활용하여 이벤트를 처리하는 예제
		// 윈도우 클래스의 내부 클래스로 정의되었기 때문에
		// 모든 UI 구성요소에 자유롭게 접근할 수 있다.
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
		this.btnPlus = new JButton("구구단 출력");		
		
		// 중첩된 내부 클래스의 객체를 사용하여 이벤트를 처리하는 예제
		this.btnPlus.addMouseListener(new GuGuDanBtnHanddlerIn());		
		
		this.add(tfN1);
		this.add(lbResult);
		this.add(btnPlus);
		
		// 윈도우 프레임의 크기를 설정
		this.setSize(300, 300);
		// 윈도우 프레임을 화면에 출력
		this.setVisible(true);
	}

	public static void main(String[] args) {
		Inner_02_Ex ex = new Inner_02_Ex("이너클래스 예제");

	}
}