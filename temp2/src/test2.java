
import javax.swing.*;
import java.awt.*;

public class test2 extends JFrame {
	Container contentPane;
	
	test2() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
		contentPane.setBackground(Color.YELLOW);
		JButton btn = new JButton();
		btn.setBackground(Color.BLACK);
		contentPane.add(btn);
		
		setSize(250,200);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test2();
	}

}
/*
너를 만난 그 이후로
사소한 변화들에 행복해져
눈이 부시게 빛 나는 아침
너를 떠올리며 눈 뜨는 하루
식탁 위에 마주 앉아
너의 하루는 어땠는지 묻거나
나의 하루도 썩 괜찮았어
웃으며 대답해 주고 싶어
별것 아닌 일에 맘이 통할 때면
익숙해진 서로가 놀라웠어
널 사랑해
평온한 지금처럼만
영원하고 싶다고
너를 바라보다 생각했어
너를 만나 참 행복했어
나 이토록 사랑할 수 있었던 건
아직 어리고 모자란 내 맘
따뜻한 이해로 다 안아줘서
무심한 말투에 서로 아플 때면
차가워진 사이가
견딜 수 없어 미안해
불안한 지금이라도
영원하고 싶다고
너를 바라보다 생각했어
너를 만나 참 행복했어
나 이토록 사랑할 수 있었던 건
아직 어리고 모자란 내 맘
따뜻한 이해로 다 안아줘서
뜨거웠던 여름 지나
그리워질 빗소리에
하나 둘 수줍어 또 얼굴 붉히면
생각이 많아진
너의 눈에 입 맞출 테니
우리 함께 걸어가기로 해
나를 만나 너도 행복하니
못 해준 게 더 많아서 미안해
이기적이고 불안한 내가
너에게만은 잘하고 싶었어
오랫동안 나 기다려온
완벽한 사랑을 찾은 것 같아
날 잡아줘서 힘이 되줘서
소중한 배려로 날 안아줘서
너를 만나
*/