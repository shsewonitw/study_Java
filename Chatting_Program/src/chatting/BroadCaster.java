package chatting;

import java.awt.datatransfer.Transferable;

// 특정 클라언트의 메세지를 모든 클라이언트에게
// 전송하는 클래스
// 또는 서버의 공지 메세지를 모든 클라이언트에게
// 전송할 수도 있음
public class BroadCaster {	

	// 서버의 공지사항 전달용 메소드
	public static void broadCast(TransferData td) {
		for( int i = 0 ; i < ClientSaver.getClientSize() ; i++ )
			ClientSaver.getClient(i).notice(td);
	}
	
	// 각 클라이언트의 메시지를 모든 클라이언트에게 전달하는 메소드
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
