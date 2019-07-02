package tje.component2;

import javax.swing.*;
import java.awt.*;


public class ToolTipDelayEx extends JFrame {
	Container contentPane;
	
	ToolTipDelayEx() {
		setTitle("툴팁 지연 시간 제어");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		JLabel cherryLabel = new JLabel(new ImageIcon("cherry.png"));
		cherryLabel.setToolTipText("체리 이미지 어때요");
		JLabel appleLabel = new JLabel(new ImageIcon("apple.png"));
		appleLabel.setToolTipText("사과 이미지 어때요");
		contentPane.add(cherryLabel);
		contentPane.add(appleLabel);
		
		ToolTipManager m = ToolTipManager.sharedInstance();
		m.setInitialDelay(0);
		m.setDismissDelay(10000);
		
		setSize(400,200);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new ToolTipDelayEx();
	}
}