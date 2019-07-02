package chatting;

import java.io.*;

// 각각의 클라이언트가 전송하는 메세지를 
// 수신할 수 있는 쓰레드 클래스
public class ClientMessageReceiver extends Thread {
	private ClientData client;
	private String host;
	private ObjectOutputStream obj_out;
	private ObjectInputStream obj_in;
	
	
	
	public ClientMessageReceiver(ClientData client, String host, ObjectOutputStream obj_out,ObjectInputStream obj_in) {
		this.client = client;
		this.host = host;
		this.obj_out = obj_out;
		this.obj_in = obj_in;
	}
	
	public void run() {
		TransferData td;
		String msg;
		String chat_me;
		String chat_other;
		while( true ) {
			try {
				td = (TransferData) obj_in.readObject();
				if(td.getMsgByGuest() != null) {
					msg = td.getMsgByGuest();
					ServerUI.logTextArea.append(msg+"\n");
				}
				else if(td.getChat_me() != null) {
					chat_me = td.getChat_me();
					chat_other = td.getChat_other();
					ChattingLog chattingLog = new ChattingLog(chat_me, chat_other);
					chattingLog.makeChatLog("");
					String[] chatList;
					chatList = chattingLog.getChatList();
					TransferData td2 = new TransferData();
					td2.setChatList(chatList);
					obj_out.writeObject(td2);
				}
				else if(td.getChattingData() != null) {
					chat_me = td.getChat_me();
					chat_other = td.getChat_other();
					ChattingLog chattingLog = new ChattingLog(chat_me, chat_other);
					String chatting = chattingLog.getChatting();
					ClientUI.chatTextArea.setText(chatting);
					
				}
///			msg = 
//				ServerUI.logTextArea.append(msg+"\n");
//				
//				BroadCaster.broadCast(host, msg);
//				
			} catch (IOException | ClassNotFoundException e) {
				break;
			}
		}
		
//		ClientSaver.delClient(this.client);
//		System.out.printf("%s 클라이언트의 접속이 종료됨\n", this.host);
	}
}