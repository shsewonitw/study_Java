package tje.chat.client.panel;

import java.awt.*;
import javax.swing.*;

public class NorthPanel extends JPanel {
	private JLabel lbServerInfo = new JLabel("���� ����", SwingConstants.CENTER);
	private JLabel lbIP = new JLabel("IP", SwingConstants.CENTER);
	private JTextField tfIP = new JTextField();
	private JLabel lbPORT = new JLabel("PORT", SwingConstants.CENTER);
	private JTextField tfPORT = new JTextField();
	private JLabel lbNickName = new JLabel("��Ī", SwingConstants.CENTER);
	private JTextField tfNickName = new JTextField();
	private JCheckBox cbSaveInfo = new JCheckBox("��������", false);
	private JButton btConnect = new JButton("����");
	
	public NorthPanel() {
		this.setLayout(new GridLayout(1, 9));
		
		this.add(lbServerInfo);
		this.add(lbIP);
		this.add(tfIP);
		this.add(lbPORT);
		this.add(tfPORT);
		this.add(lbNickName);
		this.add(tfNickName);
		this.add(cbSaveInfo);
		this.add(btConnect);
	}

	public JTextField getTfIP() {
		return tfIP;
	}

	public JTextField getTfPORT() {
		return tfPORT;
	}

	public JTextField getTfNickName() {
		return tfNickName;
	}

	public JCheckBox getCbSaveInfo() {
		return cbSaveInfo;
	}

	public JButton getBtConnect() {
		return btConnect;
	}

}
