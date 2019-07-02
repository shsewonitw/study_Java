package tje.frame;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

import java.sql.*;
import tje.jdbc.util.*;
import tje.jdbc.dao.*;
import tje.jdbc.model.*;
public class UserRegistFrame extends JFrame {
	private UserRegistFrame frame = this;
	private String [] labelText = {"ID(*)","PW(*)","NAME(*)","ALIAS(*)","TEL"};
	private JLabel [] labels = new JLabel[labelText.length];
	private JTextField [] fields = new JTextField[labelText.length];
	private JButton btnRegist = new JButton("가입");
	private JButton btnModify = new JButton("수정");
	private JButton btnDelete = new JButton("삭제");
	private JButton btnReset = new JButton("초기화");
	
	
	public UserRegistFrame(String title) {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		this.setTitle(title);
		this.setLayout(new BorderLayout());
		JPanel centerPanel = new JPanel();
		centerPanel.setLayout(new GridLayout(5, 2, 3, 3));
		for( int i = 0 ; i < labelText.length ; i++ ) {
			labels[i] = new JLabel(labelText[i]);
			fields[i] = new JTextField();		
			
			centerPanel.add(labels[i]);
			centerPanel.add(fields[i]);
		}
		
		JPanel southPanel = new JPanel();
		southPanel.setLayout(new GridLayout(1,4,3,3));
		southPanel.add(btnRegist,0);
		southPanel.add(btnModify,1);
		southPanel.add(btnDelete,2);
		southPanel.add(btnReset,3);
		
		setEvent();
		
		this.add(centerPanel, BorderLayout.CENTER);
		this.add(southPanel, BorderLayout.SOUTH);
		
		
		this.setSize(400, 450);
		this.setVisible(true);		
	}
	

	void setEvent() {
		this.btnRegist.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(!notNullCheck()) {
					JOptionPane.showMessageDialog(frame, "필수입력란은 반드시 입력해야합니다.");
					return;
				}
				
				Connection conn = JDBCConnection.getConnection();
				MemberDAO dao = MemberDAO.getInstance();
				
				User user = new User(
						fields[0].getText().trim(),
						fields[1].getText().trim(),
						fields[2].getText().trim(),
						fields[3].getText().trim(),
						fields[4].getText().trim());
				
				User dupCheckUser = dao.select(conn, user);
				if( dupCheckUser != null && dupCheckUser.getId().equals(user.getId()) ) {
					JOptionPane.showMessageDialog(frame, "중복된 아이디입니다.");
					return;
				}
				
				
				dao.insert(conn, user);
				JDBCObjectManager.close(conn);
				
				
				JOptionPane.showMessageDialog(frame, fields[0].getText().trim()+"님 가입 완료!!");
				for(int i = 0 ; i < fields.length ; i++)
					fields[i].setText("");
			}
		});
		
		this.btnModify.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn = JDBCConnection.getConnection();
				MemberDAO dao = MemberDAO.getInstance();
				
				User user = new User(
						fields[0].getText().trim(),
						fields[1].getText().trim(),
						fields[2].getText().trim(),
						fields[3].getText().trim(),
						fields[4].getText().trim());
				
				for(int i = 1 ; i < fields.length ; i++) {
					if(fields[i].getText().trim().equals(""))
						continue;
					if(i==1)
						dao.updatePassword(conn, user);
					if(i==2)
						dao.updateName(conn, user);
					if(i==3)
						dao.updateAlias(conn, user);
					if(i==4)
						dao.updateTel(conn, user);

				}
				
				JDBCObjectManager.close(conn);

				JOptionPane.showMessageDialog(frame, fields[0].getText().trim()+"님 수정 완료!!");
				for(int i = 0 ; i < fields.length ; i++)
					fields[i].setText("");
			}
		});
		
		this.btnDelete.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Connection conn = JDBCConnection.getConnection();
				MemberDAO dao = MemberDAO.getInstance();
				
				User user = new User(fields[0].getText().trim());
				dao.delete(conn, user);
				JDBCObjectManager.close(conn);
				
				
				JOptionPane.showMessageDialog(frame, fields[0].getText().trim()+"님 삭제 완료!!");
				for(int i = 0 ; i < fields.length ; i++)
					fields[i].setText("");
			}
		});
		
		this.btnReset.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for(int i = 0 ; i < fields.length ; i++)
					fields[i].setText("");
			}
		});
		
	}
	
	
	
	public boolean notNullCheck() {
		boolean flag = true;
		for(int i = 0 ; i < fields.length-1 ; i++) {
			if( fields[i].getText().trim().equals(""))
				flag = false;
		}
		return flag;
	}
	public static void main(String[] args) {
		new UserRegistFrame("회원관리");
	}
}