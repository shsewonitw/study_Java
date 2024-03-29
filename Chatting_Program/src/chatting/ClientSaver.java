package chatting;

import java.io.Serializable;
import java.util.*;

// 컬렉션 클래스의 객체를 사용하여 
// 현재 서버에 접속 중인 클라이언트들을 저장하는 클래스
public class ClientSaver {
	private static ArrayList<ClientData> CLIENTS = new ArrayList<ClientData>();
	
	public static int getClientSize() {
		return CLIENTS.size();
	}
	
	public static ClientData getClient(int index) {
		return CLIENTS.get(index);
	}
	
	public static void addClient(ClientData client) {
		CLIENTS.add(client);
		System.out.printf("%s 클라이언트가 접속됨( %d )\n", client.getHost(), CLIENTS.size());
	}
	
	public static void delClient(ClientData client) {
		CLIENTS.remove(client);
		System.out.printf("%s 클라이언트가 접속을 종료함( %d )\n", client.getHost(), CLIENTS.size());
	}
	
	public static boolean checkClient(ClientData client) {
		return CLIENTS.contains(client);
	}
}










