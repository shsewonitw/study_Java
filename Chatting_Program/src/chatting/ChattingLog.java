package chatting;

import java.io.*;


public class ChattingLog extends Thread {
	String dirPath = "D:\\Student\\dev\\java_se\\sources\\Chatting_Program\\Logs";
	String fileName;
	File dir;
	File file;
	PrintWriter out;
	BufferedReader in;
	public ChattingLog(String chat_me, String chat_other) {
		try {
			dir = new File(dirPath+"\\"+chat_me);
			if(!dir.exists()) {
				dir.mkdirs();
			}
			fileName = chat_me+"-"+chat_other+".txt";
			file = new File(dir, fileName);
			

			out = 
					new PrintWriter(
							new BufferedWriter(
									new FileWriter(file,true)),true);
			in = 
					new BufferedReader(
							new FileReader(file));
		} catch (IOException e) {
			System.out.println("파일 출력 스트림 생성 실패");
		}
	}
	
	public void makeChatLog(String msg) {
		
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
			System.out.println("로그파일 출력 실패");
		}
		return noticeMsg;
	}
	
	public String[] getChatList() {
		String[] chatList = dir.list();
		return chatList;
	}
	
	public String getChatting() {
		String chatting="";
		String str;
		try {
			while( (str =in.readLine()) != null) {
				chatting += str;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return chatting;
	}
}










