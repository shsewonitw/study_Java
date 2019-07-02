package tje.net.server;

import java.util.*;

// �÷��� Ŭ������ ��ü�� ����Ͽ� 
// ���� ������ ���� ���� Ŭ���̾�Ʈ���� �����ϴ� Ŭ����
public class ClientSaver {
	private static ArrayList<Client> CLIENTS = new ArrayList<Client>();
	
	public static int getClientSize() {
		return CLIENTS.size();
	}
	
	public static Client getClient(int index) {
		return CLIENTS.get(index);
	}
	
	public static void addClient(Client client) {
		CLIENTS.add(client);
		System.out.printf("%s Ŭ���̾�Ʈ�� ���ӵ�( %d )\n", client.getHost(), CLIENTS.size());
	}
	
	public static void delClient(Client client) {
		CLIENTS.remove(client);
		System.out.printf("%s Ŭ���̾�Ʈ�� ������ ������( %d )\n", client.getHost(), CLIENTS.size());
	}
	
	public static boolean checkClient(Client client) {
		return CLIENTS.contains(client);
	}
}










