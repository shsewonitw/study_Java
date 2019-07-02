package tje.ui;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Frame extends JFrame {
	private Frame frame = this;
	JPanel centerPanel = new JPanel();
	JPanel southPanel = new JPanel();
	JLabel lbTitle = new JLabel("ȸ������");
	JLabel lbID = new JLabel("ID(*)");
	JLabel lbPW = new JLabel("PW(*)");
	JLabel lbName = new JLabel("Name(*)");
	JLabel lbAge = new JLabel("Age");
	JLabel lbTel = new JLabel("Tel");
	JTextField tfID = new JTextField();
	JTextField tfPW = new JTextField();
	JTextField tfName = new JTextField();
	JTextField tfAge = new JTextField();
	JTextField tfTel = new JTextField();
	JButton btnOK = new JButton("����");
	JButton btnNO = new JButton("�ʱ�ȭ");
	public Frame(){
		setTitle("ȸ������");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		add(lbTitle,BorderLayout.NORTH);
		centerPanel.setLayout(new GridLayout(5, 2));
		centerPanel.add(lbID,0);
		centerPanel.add(tfID,1);
		centerPanel.add(lbPW,2);
		centerPanel.add(tfPW,3);
		centerPanel.add(lbName,4);
		centerPanel.add(tfName,5);
		centerPanel.add(lbAge,6);
		centerPanel.add(tfAge,7);
		centerPanel.add(lbTel,8);
		centerPanel.add(tfTel,9);
		add(centerPanel,BorderLayout.CENTER);
		
		southPanel.setLayout(new GridLayout(1,2));
		btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(tfID.getText().equals("") || tfPW.getText().equals("") || tfName.getText().equals("")) {
					JOptionPane.showMessageDialog(frame, "�ʼ��Է¶��� �� �Է��ؾߵ˴ϴ�!!!!");
					return;
				}
				Database_MySQL dm = new Database_MySQL();
				dm.add(tfID.getText(),tfPW.getText(),tfName.getText(),tfAge.getText(),tfTel.getText(),frame);
				tfID.setText(""); tfPW.setText(""); tfName.setText(""); tfAge.setText(""); tfTel.setText("");
			}
		});
		
		btnNO.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				tfID.setText(""); tfPW.setText(""); tfName.setText(""); tfAge.setText(""); tfTel.setText("");
			}
		});
		southPanel.add(btnOK,0);
		southPanel.add(btnNO,1);
		add(southPanel,BorderLayout.SOUTH);
		
		setSize(400,400);
		setVisible(true);
	}
	public void okMsg() {
		JOptionPane.showMessageDialog(frame, "���Լ���!!");
	}
	public void failMsg() {
		JOptionPane.showMessageDialog(frame, "�ߺ��� ���̵��Դϴ�!!");
	}
	public void ageFailMsg() {
		JOptionPane.showMessageDialog(frame, "age�� ���ڸ� �Է��ؾߵ˴ϴ�.!!!");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Frame();
	}

}
