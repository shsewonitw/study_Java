package tje.chat.server.net;

import tje.chat.common.Packet;

// Ư�� Ŭ���Ʈ�� �޼����� ��� Ŭ���̾�Ʈ����
// �����ϴ� Ŭ����
// �Ǵ� ������ ���� �޼����� ��� Ŭ���̾�Ʈ����
// ������ ���� ����
public class BroadCaster {	
	
	// ������ �������� ����� �޼ҵ�
	public static void broadCast(Packet packet) {
		for( int i = 0 ; i < ClientSaver.getClientSize() ; i++ )
			ClientSaver.getClient(i).send(packet);
	}
	
	public static void broadCast(Packet packet, String targetIp) {
		if( ClientSaver.exits(targetIp) )
			ClientSaver.getClient(targetIp).send(packet);
	}

}









