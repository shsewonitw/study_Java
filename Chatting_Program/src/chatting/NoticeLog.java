package chatting;

import java.io.*;


public class NoticeLog extends Thread {
	String dirPath = "D:\\Student\\dev\\java_se\\sources\\Chatting_Program\\Logs";
	String fileName;
	File dir = new File(dirPath);
	File file;
	PrintWriter out;
	BufferedReader in;
	public NoticeLog(String fileName) {
		try {
			file = new File(dir, fileName);
			out = 
					new PrintWriter(
							new BufferedWriter(
									new FileWriter(file,true)),true);
			in = 
					new BufferedReader(
							new FileReader(file));
		} catch (IOException e) {
			System.out.println("���� ��� ��Ʈ�� ���� ����");
		}
	}
	
	public void makeLog(String msg) {
		out.println(msg);
		out.close();
	}

	String noticeMsg = "";
	String input;
	public String getLog() {
		try {
			while((input = in.readLine())!=null) {
				noticeMsg += input+"\n";
			}
		} catch (IOException e) {
			System.out.println("�α����� ��� ����");
		}
		return noticeMsg;
	}
	
}










