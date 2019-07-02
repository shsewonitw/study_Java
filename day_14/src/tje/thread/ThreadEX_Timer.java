package tje.thread;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ThreadEX_Timer extends JFrame {
	private JLabel lbTimer;
	private JButton btnStart;
	private JButton btnStop;
	
	private TimerThread timerThread;
	
	public ThreadEX_Timer(String title) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle(title);
		
		lbTimer = new JLabel("00 : 00 : 00", SwingConstants.CENTER);
		lbTimer.setFont(new Font("Serif", Font.BOLD, 37));
		this.add(lbTimer, BorderLayout.CENTER);
		
		JPanel southPanel = new JPanel(new GridLayout(1, 2));
		btnStart = new JButton("Start");
		btnStop = new JButton("Stop");
		btnStart.setEnabled(true);
		btnStop.setEnabled(false);
		
		southPanel.add(btnStart, 0);
		southPanel.add(btnStop, 1);
		
		
		
		this.add(southPanel, BorderLayout.SOUTH);
		
		this.btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				timerThread = new TimerThread();
				timerThread.start();
				
				btnStart.setEnabled(false);
				btnStop.setEnabled(true);
			}
		});
		
		this.btnStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( timerThread != null ) 
					timerThread.interrupt();
				
				timerThread = null;
				
				btnStart.setEnabled(true);
				btnStop.setEnabled(false);
			}
		});
				
		this.setSize(300, 200);
		this.setVisible(true);		
	}
	
	class TimerThread extends Thread {		
		public void run() {
			int nHour = 0;
			int nMinute = 0;
			int nSecond = 0;
			while(true) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {	
					// ���� ������ ��ü�� ���ؼ� interrupt
					// �޼ҵ尡 ȣ��Ǵ� ��� ����Ǵ� �ڵ�
					// (STOP ��ư�� Ŭ���� ���� ����)
					break;
				}
				
				nSecond++;
				
				if( nSecond >= 60 ) {
					nSecond = 0;
					nMinute++;
				}
				
				if( nMinute >= 60 ) {
					nMinute = 0;
					nHour++;
				}
				
				String strTimer = String.format("%02d : %02d : %02d", nHour, nMinute, nSecond);
				lbTimer.setText(strTimer);
			}
			
			// Ÿ�̸� ���� ��, �ؽ�Ʈ �ʱ�ȭ
			lbTimer.setText("00 : 00 : 00");
		}
	}

	public static void main(String[] args) {
		ThreadEX_Timer frame = new ThreadEX_Timer("Timer EX");		
	}
}












