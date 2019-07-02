package chatting;

import java.io.Serializable;
import java.util.*;

// �÷��� Ŭ������ ��ü�� ����Ͽ� 
// ���� ������ ���� ���� Ŭ���̾�Ʈ���� �����ϴ� Ŭ����
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
		System.out.printf("%s Ŭ���̾�Ʈ�� ���ӵ�( %d )\n", client.getHost(), CLIENTS.size());
	}
	
	public static void delClient(ClientData client) {
		CLIENTS.remove(client);
		System.out.printf("%s Ŭ���̾�Ʈ�� ������ ������( %d )\n", client.getHost(), CLIENTS.size());
	}
	
	public static boolean checkClient(ClientData client) {
		return CLIENTS.contains(client);
	}
}










