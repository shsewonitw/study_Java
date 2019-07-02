package tje.chat.client.panel;

import java.awt.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.util.*;

public class CenterPanel extends JPanel {
	private Vector<String> strAllClientHeader = new Vector<String>();
	private DefaultTableModel dtmAllClientModel;
	private JTable tbAllClient;

	private JLabel lbNoticeMsg = new JLabel("�����޼���", SwingConstants.CENTER);
	private JTextArea taNoticeMsg = new JTextArea();

	private Vector<String> strChatClientHeader = new Vector<String>();
	private DefaultTableModel dtmChatClientModel;
	private JTable tbChatClient = new JTable();

	private CenterRightPanel rp = new CenterRightPanel();

	public JTable getTbAllClient() {
		return this.tbAllClient;
	}
	
	public JTable getTbChatClient() {
		return this.tbChatClient;
	}
	
	public DefaultTableModel getDtmAllClientModel() {
		return dtmAllClientModel;
	}

	public JTextArea getTaNoticeMsg() {
		return taNoticeMsg;
	}

	public DefaultTableModel getDtmChatClientModel() {
		return dtmChatClientModel;
	}

	public JTextArea getTaChatMsg() {
		return this.rp.getTaChatMsg();
	}

	public JTextField getTfSendMsg() {
		return this.rp.getTfSendMsg();
	}

	public JButton getBtSend() {
		return this.rp.getBtSend();
	}

	public CenterPanel() {
		this.setLayout(new GridLayout(1, 4, 3, 0));

		// ���̺� ��� ������ Vector Ÿ������ ����
		strAllClientHeader.add("��Ī");
		strAllClientHeader.add("IP");
		strAllClientHeader.add("���ӽð�");

		// ���̺��� ������ �Է� ���� ���� �� �� �ִ� �� ��ü ����
		dtmAllClientModel = new DefaultTableModel(strAllClientHeader, 0);

		// �𵨰�ü�� ����Ͽ� JTable ��ü�� ����
		this.tbAllClient = new JTable(dtmAllClientModel);	

		// ���̺��� ������ ȭ���� ������ ����� ��츦
		// ó���ϱ� ���� ��ũ�� �� ��ü ����
		JScrollPane sp1 = new JScrollPane(this.tbAllClient);
		this.add(sp1);

		JPanel panel = new JPanel(new BorderLayout());
		panel.add(lbNoticeMsg, BorderLayout.NORTH);
		JScrollPane sp2 = new JScrollPane(taNoticeMsg);
		panel.add(sp2, BorderLayout.CENTER);

		this.add(panel);

		// ���̺� ��� ������ Vector Ÿ������ ����
		strChatClientHeader.add("��Ī");
		strChatClientHeader.add("IP");
		strChatClientHeader.add("������ �޼���");

		// ���̺��� ������ �Է� ���� ���� �� �� �ִ� �� ��ü ����
		dtmChatClientModel = new DefaultTableModel(strChatClientHeader, 0);

		// �𵨰�ü�� ����Ͽ� JTable ��ü�� ����
		this.tbChatClient = new JTable(dtmChatClientModel);

		// ���̺��� ������ ȭ���� ������ ����� ��츦
		// ó���ϱ� ���� ��ũ�� �� ��ü ����
		JScrollPane sp3 = new JScrollPane(this.tbChatClient);
		this.add(sp3);

		this.add(rp);
	}
}
