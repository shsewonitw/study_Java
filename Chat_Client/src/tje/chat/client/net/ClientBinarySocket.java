package tje.chat.client.net;

import java.net.*;

import tje.chat.client.ClientFrame;

import java.io.*;

public class ClientBinarySocket extends Thread {

	private ClientFrame frame;

	private File dir;
	private ServerSocket binarySocketServer;

	public ClientBinarySocket(ClientFrame frame) {
		this.frame = frame;

		try {
			this.binarySocketServer = new ServerSocket(50155);

			dir = new File("./save");
			if (!dir.exists())
				dir.mkdirs();

		} catch (IOException e) {
			this.binarySocketServer = null;
		}
	}

	public void run() {
		if (this.binarySocketServer == null)
			return;

		while (true) {
			try {
				Socket fileSocket = this.binarySocketServer.accept();

				// ���� ������ �����ϱ� ���� ��Ʈ��
				ObjectInputStream in = 
						new ObjectInputStream(
								new BufferedInputStream(fileSocket.getInputStream()));
				
				String fileName = null;
				try {
					fileName = (String)in.readObject();
				} catch (ClassNotFoundException e) {					
					e.printStackTrace();
				}
				File file = new File(dir, fileName);				

				this.frame.addNoticeMessage(String.format("%s ������ ������ �����մϴ�.", fileName));

				BufferedOutputStream out_file = new BufferedOutputStream(new FileOutputStream(file));

				byte[] buffer = new byte[1024];

				int size;
				while ((size = in.read(buffer)) != -1) {
					// System.out.println("CLIENT : " + size);
					out_file.write(buffer, 0, size);
					out_file.flush();
				}
				out_file.close();
				
				this.frame.addNoticeMessage(String.format("%s ���� ������ �Ϸ��߽��ϴ�.", fileName));

				in.close();
				fileSocket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	public void close() {
		try {
			this.binarySocketServer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
