package tje.net.server;

// Ư�� Ŭ���Ʈ�� �޼����� ��� Ŭ���̾�Ʈ����
// �����ϴ� Ŭ����
// �Ǵ� ������ ���� �޼����� ��� Ŭ���̾�Ʈ����
// ������ ���� ����
public class BroadCaster {	
	
	// ������ �������� ����� �޼ҵ�
	public static void broadCast(String msg) {
		for( int i = 0 ; i < ClientSaver.getClientSize() ; i++ )
			ClientSaver.getClient(i).send(msg);
	}
	
	// �� Ŭ���̾�Ʈ�� �޽����� ��� Ŭ���̾�Ʈ���� �����ϴ� �޼ҵ�
	public static synchronized void broadCast(String host, String msg) {
		for( int i = 0 ; i < ClientSaver.getClientSize() ; i++ ) {
			
			Client client = ClientSaver.getClient(i);
			
			if( !client.getHost().equals(host) )
				client.send(msg);
		}
		
		System.out.printf("%s : %s\n", host, msg);
	}

}