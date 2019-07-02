package tje.net;

import java.io.*;
import java.net.*;
import java.util.*;


class NoticeServer extends Thread {
	private ArrayList<ClientSocket> clients;
	public NoticeServer(ArrayList<ClientSocket> clients) {
		this.clients = clients;
	}
	
	@Override
	public void run() {
		BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
		
		String msg;
		while(true) {
			System.out.print("���� �޼����� �Է�: ");
			try {
				msg = kb.readLine();
				if(this.clients.size() > 0) {
					for(int i = 0 ; i < clients.size(); i++)
						this.clients.get(i).send(msg);
				}
				
				if(msg.equals("bye"))
					break;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


class ClientSocket {
	private Socket socket;
	private BufferedReader in;
	private PrintWriter out;
	
	public ClientSocket(Socket socket) {
		this.socket = socket;
		// �����ڷ� ���޵� Socket ��ü�� ����Ͽ� ��Ʈ�� ����
		try {
			this.in = new BufferedReader(new InputStreamReader(this.socket.getInputStream()));
			this.out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(this.socket.getOutputStream())),true);
		} catch (IOException e) {
			System.out.println("��Ʈ�� ��ü �������� ���� �߻�");
		}
	}
	
	public void send(String msg) {
		this.out.println(msg);
	}
}


public class Server_06 {

	public static void main(String[] args) {
		// ���� Ŭ���̾�Ʈ�� ������ ó���� �� �ִ� ���� ���α׷�
		// 1. �ټ����� Ŭ���̾�Ʈ(Socket)�� ������ �� �ִ� ����
		// - �÷��� Ÿ���� ����
		ArrayList<ClientSocket> clients = new ArrayList<ClientSocket>();
		
		// ��� Ŭ���̾�Ʈ���� ���������� ������ �� �ִ� �����带 ����
		new NoticeServer(clients).start();
		
		int port = 7070;
		ServerSocket server = null;
		try {
			server = new ServerSocket(port);
		} catch (IOException e) {
			System.out.printf("�ٸ� ���μ������� ��Ʈ��ȣ(%d)�� ����ϰ� �ֽ��ϴ�.\n",port);
			return;
		}
		
		
		// 2. ���� Ŭ���̾�Ʈ�� ó���ϱ� ���ؼ� accept �޼ҵ��� �ݺ� ó��
		while (true) {
			System.out.println("Ŭ���̾�Ʈ�� ������ ��� ��...");
			Socket socket = null;
			try {
				socket = server.accept();
				clients.add(new ClientSocket(socket));
				System.out.println("Ŭ���̾�Ʈ�� ���ӵ�");
			} catch (IOException e) {
				System.out.println("accept �޼ҵ忡�� ���ܰ� �߻�");
				try {
					server.close();
				} catch (IOException e1) {
					System.out.println("������ ���� �������� ���ܰ� �߻�");
				}
				return;
			}

			
		}
		
	}
}