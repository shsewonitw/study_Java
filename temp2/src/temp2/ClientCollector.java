package temp2;

import java.io.IOException;
import java.net.*;


public class ClientCollector extends Thread {
	private ServerSocket server;
	
	public ClientCollector(int port) {
		try {
			this.server = new ServerSocket(port);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Override
	public void run() {
		
		while(true) {
			Socket socket;
			try {
				socket = server.accept();
				Client client = new Client(socket);
				if(!ClientSaver.checkClient(client)) {
					ClientSaver.addClient(client);
					
				} else {
					client.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				break;
			}			
		}

	}
}
