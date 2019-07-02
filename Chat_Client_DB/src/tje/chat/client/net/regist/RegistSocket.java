package tje.chat.client.net.regist;

import java.net.*;
import java.util.*;

import javax.swing.*;

import java.io.*;

import tje.chat.client.*;
import tje.chat.common.*;
import tje.chat.model.*;
import tje.jdbc.model.*;

public class RegistSocket extends Thread {
	private ClientFrame frame;
	private ServerInfo serverInfo;
	private Socket socket;
	private Member member;
	
	private ObjectOutputStream out;
	private ObjectInputStream in;
	
	public RegistSocket(ClientFrame frame, ServerInfo serverInfo, Member member) {
		this.frame = frame;
		this.serverInfo = serverInfo;
		this.member = member;
		try {			
			this.socket = new Socket(serverInfo.getIp(), serverInfo.getPort());
			
			out = new ObjectOutputStream(
					new BufferedOutputStream(this.socket.getOutputStream()));
			out.flush();
			
			in = new ObjectInputStream(
					new BufferedInputStream(this.socket.getInputStream()));	
			
			out.writeObject(this.member);		
			out.flush();			
			
			String result = (String)in.readObject();
			
			JOptionPane.showMessageDialog(null, result);
			this.frame.addNoticeMessage(result);
			
			in.close();
			out.close();
			this.socket.close();
		} catch (Exception e) {
			this.socket = null;
			JOptionPane.showMessageDialog(null, "회원가입 서버와 연결 과정에서 문제가 발생했습니다.");
			return;
		}
	}
	
}












