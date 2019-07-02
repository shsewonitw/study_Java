package temp2;

import java.util.*;


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
	}
	
	public static void delClient(Client client) {
		CLIENTS.remove(client);
	}
	
	public static boolean checkClient(Client client) {
		return CLIENTS.contains(client);
	}
}


