package chatting;

import java.awt.datatransfer.Transferable;

// Ư�� Ŭ���Ʈ�� �޼����� ��� Ŭ���̾�Ʈ����
// �����ϴ� Ŭ����
// �Ǵ� ������ ���� �޼����� ��� Ŭ���̾�Ʈ����
// ������ ���� ����
public class BroadCaster {	

	// ������ �������� ���޿� �޼ҵ�
	public static void broadCast(TransferData td) {
		for( int i = 0 ; i < ClientSaver.getClientSize() ; i++ )
			ClientSaver.getClient(i).notice(td);
	}
	
	// �� Ŭ���̾�Ʈ�� �޽����� ��� Ŭ���̾�Ʈ���� �����ϴ� �޼ҵ�
//	public static synchronized void broadCast(String host, String msg) {
//		for( int i = 0 ; i < ClientSaver.getClientSize() ; i++ ) {
//			
//			ClientData client = ClientSaver.getClient(i);
//			
//			if( !client.getHost().equals(host) )
//				client.send(msg);
//		}
//		
//		System.out.printf("%s : %s\n", host, msg);
//	}

}
