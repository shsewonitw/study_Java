package chatting;

import java.io.Serializable;
import java.util.ArrayList;


public class TransferData implements Serializable{
	
	private String noticeMsg;
	private String hostName;
	
	private String guestNum;
	private String[] guestHost;
	private String host;
	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}
	private String msgByGuest;

	private String chat_other;
	private String chat_me;
	
	private String[] chatList;
	
	private String chattingData;
	
	public String getChattingData() {
		return chattingData;
	}

	public void setChatting(String chattingData) {
		this.chattingData = chattingData;
	}

	public String[] getChatList() {
		return chatList;
	}

	public void setChatList(String[] chatList) {
		this.chatList = chatList;
	}

	public TransferData() {}
	
	public String getChat_other() {
		return chat_other;
	}

	public void setChat_other(String chat_other) {
		this.chat_other = chat_other;
	}

	public String getChat_me() {
		return chat_me;
	}

	public void setChat_me(String chat_me) {
		this.chat_me = chat_me;
	}

	public void setNoticeMsg(String noticeMsg) {
		this.noticeMsg = noticeMsg;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	public void setGuestNum(String guestNum) {
		this.guestNum = guestNum;
	}
	public void setGuestHost(String[] guestHost) {
		this.guestHost = guestHost;
	}
	public void setMsgByGuest(String msgByGuest) {
		this.msgByGuest = msgByGuest;
	}
	public String getNoticeMsg() {
		return noticeMsg;
	}
	public String getHostName() {
		return hostName;
	}
	public String getGuestNum() {
		return guestNum;
	}
	public String[] getGuestHost() {
		return guestHost;
	}
	public String getMsgByGuest() {
		return msgByGuest;
	}
	
	
	
	
}
