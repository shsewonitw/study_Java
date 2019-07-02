package tje.frame;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import tje.jdbc.dao.*;
import tje.jdbc.model.*;
import tje.jdbc.util.*;


public class NaverJoinFrame extends JFrame {
	private boolean idCheck = false;
	private boolean pw1Check = false;
	private boolean pw2Check = false;
	private boolean nameCheck = false;
	private boolean birthCheck = false;
	private boolean genderCheck = false;
	private boolean emailCheck = false;
	private boolean telCheck = false;
	
	private Frame frame = this;
	private UsersDAO dao = UsersDAO.getInstance();
	
	private ImageIcon icMain = new ImageIcon("./images/naver2.png");
	private JLabel lbMain = new JLabel(icMain);
	
	private JPanel id_Panel = new JPanel();
	private JLabel lbId = new JLabel("아이디");
	private JTextField tfId = new JTextField();
	private JLabel lbIdCheck = new JLabel(" ");
	
	private JPanel pw1_Panel = new JPanel();
	private JLabel lbPw1 = new JLabel("비밀번호");
	private JPasswordField pfPw1 = new JPasswordField();
	private JLabel lbPw1Check = new JLabel(" ");
	
	private JPanel pw2_Panel = new JPanel();
	private JLabel lbPw2 = new JLabel("비밀번호 재확인");
	private JPasswordField pfPw2 = new JPasswordField();
	private JLabel lbPw2Check = new JLabel(" ");
	
	private JPanel name_Panel = new JPanel();
	private JLabel lbName = new JLabel("이름");
	private JTextField tfName = new JTextField();
	private JLabel lbNameCheck = new JLabel(" ");
	
	private JPanel birth_Panel = new JPanel();
	private JLabel lbBirth = new JLabel("생년월일");
	private JPanel birth_Center_Panel = new JPanel(new GridLayout(1,3,15,0));
	private JTextField tfBirthYear = new JTextField();
	String [] monthList= {"월","1","2","3","4","5","6","7","8","9","10","11","12"};
	private JComboBox cbBirthMonth = new JComboBox(monthList);
	private JTextField tfBirthDay = new JTextField();
	private JLabel lbBirthCheck = new JLabel(" ");
	
	private JPanel gender_Panel = new JPanel();
	private JLabel lbGender = new JLabel("성별");
	String [] genderList = {"성별","남자","여자"};
	private JComboBox cbGender = new JComboBox(genderList);
	private JLabel lbGenderCheck = new JLabel(" ");	
	
	private JPanel email_Panel = new JPanel();
	private JLabel lbEmail = new JLabel("본인 확인 이메일");
	private JTextField tfEmail = new JTextField();
	private JLabel lbEmailCheck = new JLabel(" ");
	
	private JPanel tel_Panel = new JPanel();
	private JPanel tel_center = new JPanel(new GridLayout(2, 1, 0, 5));
	private JLabel lbTel = new JLabel("휴대전화");
	String [] telList = { "대한민국 +82","브라질 +55", "네덜란드 +31", "네팔 +977", "남극 +672", "짐바브웨 +263", "카타르 +974"};
	private JComboBox cbTel = new JComboBox(telList);
	private JTextField tfTel = new JTextField();
	private JLabel lbTelCheck = new JLabel(" ");
	
	private ImageIcon icOK = new ImageIcon("./images/btnOK.png");
	private JButton btnOK = new JButton("",icOK);
	
	private JPanel left = new JPanel();
	private JPanel right = new JPanel();
	private JPanel center = new JPanel(new GridLayout(10,1,0,7));
	public NaverJoinFrame() {
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setTitle("네이버 회원가입");
		id_Panel.setLayout(new BorderLayout());
		id_Panel.add(lbId,BorderLayout.NORTH);
		id_Panel.add(tfId,BorderLayout.CENTER);
		id_Panel.add(lbIdCheck,BorderLayout.SOUTH);
		
		pw1_Panel.setLayout(new BorderLayout());
		pw1_Panel.add(lbPw1,BorderLayout.NORTH);
		pw1_Panel.add(pfPw1,BorderLayout.CENTER);
		pw1_Panel.add(lbPw1Check,BorderLayout.SOUTH);
		
		pw2_Panel.setLayout(new BorderLayout());
		pw2_Panel.add(lbPw2,BorderLayout.NORTH);
		pw2_Panel.add(pfPw2,BorderLayout.CENTER);
		pw2_Panel.add(lbPw2Check,BorderLayout.SOUTH);
		
		name_Panel.setLayout(new BorderLayout());
		name_Panel.add(lbName,BorderLayout.NORTH);
		name_Panel.add(tfName,BorderLayout.CENTER);
		name_Panel.add(lbNameCheck,BorderLayout.SOUTH);
		
		birth_Panel.setLayout(new BorderLayout());
		birth_Panel.add(lbBirth,BorderLayout.NORTH);
		birth_Center_Panel.add(tfBirthYear,0);
		birth_Center_Panel.add(cbBirthMonth,1);
		birth_Center_Panel.add(tfBirthDay,2);
		birth_Panel.add(birth_Center_Panel,BorderLayout.CENTER);
		birth_Panel.add(lbBirthCheck,BorderLayout.SOUTH);
		
		gender_Panel.setLayout(new BorderLayout());
		gender_Panel.add(lbGender,BorderLayout.NORTH);
		gender_Panel.add(cbGender, BorderLayout.CENTER);
		gender_Panel.add(lbGenderCheck, BorderLayout.SOUTH);
		
		email_Panel.setLayout(new BorderLayout());
		email_Panel.add(lbEmail,BorderLayout.NORTH);
		email_Panel.add(tfEmail,BorderLayout.CENTER);
		email_Panel.add(lbEmailCheck,BorderLayout.SOUTH);
		
		tel_Panel.setLayout(new BorderLayout());
		tel_Panel.add(lbTel,BorderLayout.NORTH);
		tel_center.add(cbTel,0);
		tel_center.add(tfTel,1);
		tel_Panel.add(tel_center,BorderLayout.CENTER);
		tel_Panel.add(lbTelCheck,BorderLayout.SOUTH);
		
		center.add(lbMain,0); center.add(id_Panel,1); center.add(pw1_Panel);
		center.add(pw2_Panel,3); center.add(name_Panel,4); center.add(birth_Panel,5);
		center.add(gender_Panel,6); center.add(email_Panel,7); center.add(tel_Panel,8); center.add(btnOK,9);
		this.add(center,BorderLayout.CENTER);
		this.add(left, BorderLayout.WEST);
		this.add(right, BorderLayout.EAST);
		
		listeners();
		
		this.setSize(400,900);
		this.setVisible(true);
	}
	
	private void listeners() {
		
		this.tfId.addKeyListener(new myKeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String temp = "";
				if(e.getKeyChar() != KeyEvent.VK_BACK_SPACE)
					temp = tfId.getText().trim()+e.getKeyChar();
				else
					temp = tfId.getText().trim();
				if(temp.length() >=5 && temp.length() <=20) {
					lbIdCheck.setText("<html><font color='green'>멋진 아이디네요 ㅋ</font></html>");
					idCheck = true;
				}
				else if(temp.length() == 0) {
					lbIdCheck.setText("<html><font color='red'>필수 입력입니다</font></html>");
					idCheck = false;
				}
				else {
					lbIdCheck.setText("<html><font color='red'>5~20자만 입력가능합니다</font></html>");
					idCheck = false;
				}
			}
		});
		
		this.pfPw1.addKeyListener(new myKeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String temp = "";
				if(e.getKeyChar() != KeyEvent.VK_BACK_SPACE)
//					temp = pfPw1.getText().trim()+e.getKeyChar();
					temp = String.valueOf(pfPw1.getPassword())+e.getKeyChar();
				else
//					temp = pfPw1.getText().trim();
					temp = String.valueOf(pfPw1.getPassword());
				
				if(temp.length()>=8 && temp.length()<=16) {
					lbPw1Check.setText(" ");
					pw1Check = true;
				}
				else if(temp.length() == 0) {
					lbPw1Check.setText("<html><font color='red'>필수 입력입니다</font></html>");
					pw1Check = false;
				}
				else {
					lbPw1Check.setText("<html><font color='red'>8~16자만 입력 가능합니다</font></html>");
					pw1Check = false;
				}
			}
		});
		
		this.pfPw2.addKeyListener(new myKeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String pw1 = "";
				String pw2 = "";
//				pw1 = pfPw1.getText().trim();
				pw1 = String.valueOf(pfPw1.getPassword());
				if(e.getKeyChar() != KeyEvent.VK_BACK_SPACE)
//					pw2 = pfPw2.getText().trim()+e.getKeyChar();
					pw2 = String.valueOf(pfPw2.getPassword())+e.getKeyChar();
				else
//					pw2 = pfPw2.getText().trim();
					pw2 = String.valueOf(pfPw2.getPassword());
				if(!pw1.equals(pw2)) {
					lbPw2Check.setText("<html><font color='red'>비밀번호가 일치하지 않습니다</font></html>");
					pw2Check = false;
				}
				else {
					lbPw2Check.setText("<html><font color='green'>비밀번호가 일치합니다</font></html>");
					pw2Check = true;
				}
			}
		});
		
		this.tfName.addKeyListener(new myKeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String temp = "";
				if(e.getKeyChar() != KeyEvent.VK_BACK_SPACE)
					temp = tfName.getText().trim()+e.getKeyChar();
				else
					temp = tfName.getText().trim();
				
				if(temp.length() == 0) {
					lbNameCheck.setText("<html><font color='red'>필수입력입니다</font></html>");
					nameCheck = false;
				}
				else if(temp.length() > 16) {
					lbNameCheck.setText("<html><font color='red'>이름이 너무 깁니다</font></html>");
					nameCheck = false;
				}
				else {
					lbNameCheck.setText(" ");
					nameCheck = true;
				}
			}
		});
		
		this.tfBirthYear.addKeyListener(new myKeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String temp = "";
				if(e.getKeyChar() != KeyEvent.VK_BACK_SPACE)
					temp = tfBirthYear.getText().trim()+e.getKeyChar();
				else
					temp = tfBirthYear.getText().trim();
				
				if(temp.length() != 4) {
					lbBirthCheck.setText("<html><font color='red'>태어난 년도 4자리를 정확하게 입력하세요</font></html>");
					birthCheck = false;
				}
				else if(cbBirthMonth.getSelectedItem().toString().equals("월")) {
					lbBirthCheck.setText("<html><font color='red'>태어난 월을 선택해주세요</font></html>");
					birthCheck = false;
				}
				else if(tfBirthDay.getText().trim().length() < 1 || tfBirthDay.getText().trim().length() >2 ) {
					lbBirthCheck.setText("<html><font color='red'>태어난 일을 확인해주세요</font></html>");
					birthCheck = false;
				}
				else {
					lbBirthCheck.setText(" ");
					birthCheck = true;
				}
			}
		});
		
		this.cbBirthMonth.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = "";
				temp = cbBirthMonth.getSelectedItem().toString();
				if(tfBirthYear.getText().trim().length() != 4) {
					lbBirthCheck.setText("<html><font color='red'>태어난 년도 4자리를 정확하게 입력하세요</font></html>");
					birthCheck = false;
				}
				else if(temp.equals("월")) {
					lbBirthCheck.setText("<html><font color='red'>태어난 월을 선택해주세요</font></html>");
					birthCheck = false;
				}
				else if(tfBirthDay.getText().trim().length() < 1 || tfBirthDay.getText().trim().length() >2  ) {
					lbBirthCheck.setText("<html><font color='red'>태어난 일을 확인해주세요</font></html>");
					birthCheck = false;
				}
				else {
					lbBirthCheck.setText(" ");
					birthCheck = true;
				}
			}
		});
		
		
		
		this.tfBirthDay.addKeyListener(new myKeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String temp = "";
				if(e.getKeyChar() != KeyEvent.VK_BACK_SPACE)
					temp = tfBirthDay.getText().trim()+e.getKeyChar();
				else
					temp = tfBirthDay.getText().trim();
				if(tfBirthYear.getText().trim().length() != 4) {
					lbBirthCheck.setText("<html><font color='red'>태어난 년도 4자리를 정확하게 입력하세요</font></html>");
					birthCheck = false;
				}
				else if(cbBirthMonth.getSelectedItem().toString().equals("월")) {
					lbBirthCheck.setText("<html><font color='red'>태어난 월을 선택해주세요</font></html>");
					birthCheck = false;
				}
				else if(temp.length() < 1 || temp.length() >2 ) {
					lbBirthCheck.setText("<html><font color='red'>태어난 일을 확인해주세요</font></html>");
					birthCheck = false;
				}
				else {
					lbBirthCheck.setText(" ");
					birthCheck = true;
				}
			}
		});
		
		this.cbGender.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String temp = "";
				temp = cbGender.getSelectedItem().toString();
				if(temp.equals("성별")) {
					lbGenderCheck.setText("<html><font color='red'>성별을 선택해주세요</font></html>");
					genderCheck = false;
				}
				else {
					lbGenderCheck.setText(" ");
					genderCheck = true;
				}
			}
		});
		
		this.tfEmail.addKeyListener(new myKeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String temp = "";
				if(e.getKeyChar() != KeyEvent.VK_BACK_SPACE)
					temp = tfEmail.getText().trim()+e.getKeyChar();
				else
					temp = tfEmail.getText().trim();
				
				if(temp.length() > 25) {
					lbEmailCheck.setText("<html><font color='red'>이메일이 너무 깁니다</font></html>");
					emailCheck = false;
				}
				else {
					lbEmailCheck.setText(" ");
					emailCheck = true;
				}
				
			}
		});
		
		this.tfTel.addKeyListener(new myKeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {
				String temp = "";
				if(e.getKeyChar() != KeyEvent.VK_BACK_SPACE)
					temp = tfTel.getText().trim()+e.getKeyChar();
				else
					temp = tfTel.getText().trim();
				
				if(temp.length()==0) {
					lbTelCheck.setText("<html><font color='red'>필수입력입니다</font></html>");
					telCheck = false;
				}
				else if(temp.length() > 16) {
					lbTelCheck.setText("<html><font color='red'>전화번호가 너무 깁니다</font></html>");
					telCheck = false;
				}
				else {
					lbTelCheck.setText(" ");
					telCheck = true;
				}
				
			}
		});
		
		this.btnOK.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String id = tfId.getText().trim();
				String pw = pfPw1.getText().trim();
				String name = tfName.getText().trim();
				String birth = tfBirthYear.getText().trim() +"."+ cbBirthMonth.getSelectedItem().toString() +"."+ tfBirthDay.getText().trim();
				String gender = cbGender.getSelectedItem().toString();
				String email = tfEmail.getText().trim();
				String tel = cbTel.getSelectedItem().toString() + " " +tfTel.getText().trim();
				Users users = new Users(id,pw,name,birth,gender,email,tel);
//				System.out.println(id+","+pw+","+name+","+birth+","+gender+","+email+","+tel);
				if(idCheck && pw1Check && pw2Check && nameCheck && birthCheck && genderCheck && emailCheck && telCheck) {
					Connection conn = JDBCConnection.getConnection();
					
					Users temp = null;
					temp = dao.select(conn, users);
					if(temp != null) {
						JOptionPane.showMessageDialog(frame, "중복된 아이디입니다");
						return;
					}
					
					dao.insert(conn, users);
					JOptionPane.showMessageDialog(frame, id+"님 가입 성공!");

					tfId.setText("");pfPw1.setText("");pfPw2.setText("");tfName.setText("");
					tfBirthDay.setText("");tfBirthYear.setText("");tfEmail.setText("");
					tfTel.setText("");cbBirthMonth.setSelectedIndex(0);cbGender.setSelectedIndex(0);
					idCheck = false;pw1Check = false;pw2Check = false;nameCheck = false;
					birthCheck = false;genderCheck = false;emailCheck = false;telCheck = false;
					lbIdCheck.setText(" ");lbPw1Check.setText(" ");lbPw2Check.setText(" ");lbNameCheck.setText(" ");
					lbBirthCheck.setText(" ");lbGenderCheck.setText(" ");lbEmailCheck.setText(" ");lbTelCheck.setText(" ");
					
					JDBCObjectManager.close(conn);
				}
				else {
					JOptionPane.showMessageDialog(frame, "입력한 정보를 확인해주세요");
				}
			}
		});
	}
	
	class myKeyListener implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {}
		@Override
		public void keyPressed(KeyEvent e) {}
		@Override
		public void keyReleased(KeyEvent e) {}
		
	}
	public static void main(String[] args) {
		new NaverJoinFrame();
	}
}