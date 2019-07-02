package temp2;

public class BroadCaster {
	
	
	public static void broadCast(String msg) {
		for(int i = 0 ; i < ClientSaver.getClientSize() ; i++) {
			Client client = ClientSaver.getClient(i);
			client.send(msg);
		}
	}
	
	public static void broadCast(String host, String msg) {
		for(int i = 0 ; i < ClientSaver.getClientSize() ; i++) {
			Client client = ClientSaver.getClient(i);
			
			if(!client.getHost().equals(host))
				client.send(msg);
		}
	}
}
