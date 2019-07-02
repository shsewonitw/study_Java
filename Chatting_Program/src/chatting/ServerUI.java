package chatting;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.SoftBevelBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;



public class ServerUI extends JFrame {
	Container contentPane;
	Boolean isEnd = false;
	ClientCollector collector = null;
	public static JTextArea logTextArea = new JTextArea();

	public ServerUI() {
		setTitle("Chatting Server");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		
		
		JLabel portLabel= new JLabel("��Ʈ��ȣ");
		JTextField portTextField = new JTextField(10);
		JButton portButton = new JButton("����");
		portButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				if(portButton.getText().equals("����")) {
					collector = new ClientCollector(Integer.parseInt(portTextField.getText()));
					System.out.println(Integer.parseInt(portTextField.getText())+"��������");
					portButton.setText("����");
					collector.start();
				}
				else {
					isEnd = true;
					collector.closeServer();
					portButton.setText("����");
				}
			}
		});
		JPanel northPanel = new JPanel(new FlowLayout());
		northPanel.setBorder(new LineBorder(Color.BLACK, 1));
		northPanel.add(portLabel);
		northPanel.add(portTextField);
		northPanel.add(portButton);

		
		
		logTextArea.setVisible(false);
		JCheckBox logCheckBox = new JCheckBox("�α׸� �����?");
		logCheckBox.addItemListener(new ItemListener() {
			@Override
			public void itemStateChanged(ItemEvent e) {
				if(e.getStateChange() == ItemEvent.SELECTED) {
					logTextArea.setVisible(true);
				} else {
					logTextArea.setVisible(false);
				}
			}
		});
		JPanel centerPanel = new JPanel(new BorderLayout());
		JPanel logPanel = new JPanel(new FlowLayout());
		centerPanel.setBorder(new BevelBorder(SoftBevelBorder.LOWERED));
		centerPanel.add(logTextArea,BorderLayout.CENTER);
							
		logPanel.setBorder(new LineBorder(Color.BLACK,1));
		logPanel.add(logCheckBox);
		centerPanel.add(logPanel,BorderLayout.SOUTH);
		
		JLabel noticeLabel = new JLabel("�����޼���");
		JTextField noticeTextField = new JTextField(10);
		JButton noticeButton = new JButton("����");
		noticeButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String msg;
				msg = noticeTextField.getText();
				NoticeLog log = new NoticeLog("Notice.txt");
				log.makeLog(msg);
				msg = log.getLog();
				TransferData td = new TransferData();
				td.setNoticeMsg(msg);
				BroadCaster.broadCast(td);
				noticeTextField.setText("");
				noticeTextField.requestFocus();
			}
		});
		JButton fileButton = new JButton("��������");
		JPanel southPanel = new JPanel(new FlowLayout());
		southPanel.add(noticeLabel);
		southPanel.add(noticeTextField);
		southPanel.add(noticeButton);
		southPanel.add(fileButton);
		
		
		contentPane.add(northPanel, BorderLayout.NORTH);
		contentPane.add(centerPanel,BorderLayout.CENTER);
		contentPane.add(southPanel,BorderLayout.SOUTH);
		
		setSize(500,700);
		setVisible(true);
	}
	
	public static ClientSaver clientSaver() {
		return new ClientSaver();
	}
	
	
	
	public static void main(String[] args) {
		new ServerUI();

	}

}