package tje.component;

import javax.swing.*;
import java.awt.*;


public class SliderEx  extends JFrame {
	Container contentPane;
	
	SliderEx() {
		setTitle("�����̴� ����� ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new FlowLayout());
		
		JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 200, 100);
		slider.setPaintLabels(true);
		slider.setPaintTicks(true);
		slider.setPaintTrack(true);
		slider.setMajorTickSpacing(50);
		slider.setMinorTickSpacing(10);
		contentPane.add(slider);
		setSize(300,100);
		setVisible(true);
	}
	public static void main(String[] args) {
		new SliderEx();
	}
}
