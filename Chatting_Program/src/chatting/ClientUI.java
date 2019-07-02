package chatting;

import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;
import java.util.StringTokenizer;



public class ClientUI extends JFrame {
	Container contentPane;
	Client client;
	
//	BufferedReader br;
	public static JList chatListList = new JList();
	public static JTextArea noticeMessageOutput = new JTextArea();
	public static JList guestList = new JList();
	public static JTextArea chatTextArea = new JTextArea();
	String notice = "";
	public ClientUI() {
		setTitle("Chatting Client");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());
		JLabel serverInfo = new JLabel("��������");
		JCheckBox saveInfo = new JCheckBox("�����������");
		
		JLabel IPInfo = new JLabel("IP");
		String ipStr = "";
		JTextField IPTextField = new JTextField(ipStr,10);
		
		JLabel portInfo = new JLabel("PORT");
		String portStr = "";
		JTextField portTextField = new JTextField(portStr,10);
		
		JLabel name = new JLabel("��Ī");
		String nameStr = "";
		JTextField nameTextField = new JTextField(nameStr,5);
		
		JButton inOutButton = new JButton("����");
		inOutButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(inOutButton.getText().equals("����")) {	
					String guestHost = IPTextField.getText();
					int guestPort = Integer.parseInt(portTextField.getText());
					String guestName = nameTextField.getText();
					client = new Client(guestHost, guestPort, guestName);
					client.guestStart();
					client.nt.start();
					inOutButton.setText("����");
				}
				else {
					client.guestEnd();
					inOutButton.setText("����");
				}
			}
		});
		guestList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					String chat_other = (String)guestList.getSelectedValue();
					String chat_me = client.getHost();
					TransferData td = new TransferData();
					td.setChat_other(chat_other);
					td.setChat_me(chat_me);
					try {
						client.obj_out.writeObject(td);
					} catch (IOException e1) {
						System.out.println("ClientUI writeObject����");
					}
				}
			}
		});
		JPanel northPanel = new JPanel(new FlowLayout());
		northPanel.add(serverInfo);
		northPanel.add(saveInfo);
		northPanel.add(IPInfo);
		northPanel.add(IPTextField);
		northPanel.add(portInfo);
		northPanel.add(portTextField);
		northPanel.add(name);
		northPanel.add(nameTextField);
		northPanel.add(inOutButton);
		
		
		
		JPanel centerPanel = new JPanel(new GridLayout(1,4));
	
		
		JPanel clientList = new JPanel(new BorderLayout());
		JLabel clientListLabel = new JLabel("�������� Ŭ���̾�Ʈ ���");
		
		
		clientList.add(clientListLabel,BorderLayout.NORTH);
		clientList.add(guestList,BorderLayout.CENTER);
		
		
		JPanel notice = new JPanel(new BorderLayout());
		JLabel noticeMessage = new JLabel("���� �޼���");
		notice.add(noticeMessage,BorderLayout.NORTH);
		notice.add(noticeMessageOutput,BorderLayout.CENTER);
		
		
		JPanel chatList = new JPanel(new BorderLayout());
		JLabel chatListLabel = new JLabel("��ȭ���� ���");
		
		chatListList.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2) {
					String chatting = (String)guestList.getSelectedValue();
					String chat_me=null;
					String chat_other=null;
					StringTokenizer st = new StringTokenizer(chatting, "-");
					while(st.hasMoreTokens()) {
						chat_me = st.nextToken();
						chat_other = st.nextToken();
					}
					TransferData td = new TransferData();
					td.setChat_me(chat_me);
					td.setChat_other(chat_other);
					td.setChat_other(chatting);
					try {
						client.obj_out.writeObject(td);
					} catch (IOException e1) {
						System.out.println("ClientUI writeObject����");
					}
				}
			}
		});
		chatList.add(chatListLabel,BorderLayout.NORTH);
		chatList.add(chatListList,BorderLayout.CENTER);
		
		
		JPanel chat = new JPanel(new BorderLayout());
		JPanel southPanel = new JPanel(new FlowLayout());
		
		JTextField chatTextField = new JTextField(10);
		JButton chatButton = new JButton("����");
		chatButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("���۹�ư����");
				String msg = chatTextField.getText();
				String name = nameTextField.getText();
				TransferData td = new TransferData();
				td.setMsgByGuest("["+name+"] "+msg);
				try {
					client.obj_out.writeObject(td);
				} catch (IOException e1) {
					System.out.println("clientUI ������Ʈ ��� ����");
				}
				chatTextField.setText("");
				chatTextField.requestFocus();
				
			}
		});
		JButton fileButton = new JButton("��������");
		southPanel.add(chatTextField);
		southPanel.add(chatButton);
		southPanel.add(fileButton);
		chat.add(chatTextArea, BorderLayout.CENTER);
		chat.add(southPanel, BorderLayout.SOUTH);
		
		
		centerPanel.setBorder(new LineBorder(Color.BLACK,3));
		clientList.setBorder(new LineBorder(Color.BLACK,1));
		notice.setBorder(new LineBorder(Color.BLACK,1));
		chatList.setBorder(new LineBorder(Color.BLACK,1));
		chat.setBorder(new LineBorder(Color.BLACK,1));
		centerPanel.add(clientList);
		centerPanel.add(notice);
		centerPanel.add(chatList);
		centerPanel.add(chat);
		
		contentPane.add(northPanel,BorderLayout.NORTH);
		contentPane.add(centerPanel,BorderLayout.CENTER);
		setSize(1200,500);
		setVisible(true);
	}
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClientUI();
	}

}