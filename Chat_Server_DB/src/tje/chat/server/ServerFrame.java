package tje.chat.server;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetAdapter;
import java.awt.dnd.DropTargetDropEvent;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.sql.Connection;

import javax.swing.*;

import java.text.SimpleDateFormat;
import java.util.*;
import java.util.List;

import tje.chat.common.Packet;
import tje.chat.server.net.*;
import tje.chat.server.panel.*;
import tje.jdbc.dao.NoticeDAO;
import tje.jdbc.model.Notice;
import tje.jdbc.util.JDBCConnection;
import tje.jdbc.util.JDBCObjectManager;
import tje.chat.server.net.regist.*;

public class ServerFrame extends JFrame {
	// ���� ������ ��ü�� ��������
	// �ܺ��� Ŭ�������� ���� �����ӿ� �����ϱ� ���ؼ� ���
	// (�͸�, ���� Ŭ�������� ����� ����)
	private ServerFrame frame = this;
	
	private NorthPanel np = new NorthPanel();
	private CenterPanel cp = new CenterPanel();
	private SouthPanel sp = new SouthPanel();
	
	private DropTarget dropTarget = new DropTarget(
			cp.getTaLog(), DnDConstants.ACTION_COPY_OR_MOVE, new FileTransfer(), true, null);
	
	private ClientCollector clientCollector;
	private RegistClientCollector registClientCollector;
	
	public ServerFrame() {		
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		this.setTitle("Chat Server - Ver 0.1");
		
		// ȭ�� ��ġ
		this.add(np, BorderLayout.NORTH);
		this.add(cp, BorderLayout.CENTER);
		this.add(sp, BorderLayout.SOUTH);
		
		// �� ������Ʈ�� �̺�Ʈ ó��
		
		this.sp.getTfNoticeMsg().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = sp.getTfNoticeMsg().getText().trim();
				if( msg.length() == 0 ) {
					JOptionPane.showMessageDialog(null, "�޼����� �Է��ؾ߸� �մϴ�.");					
					return;
				}
				
				Packet packet = new Packet(Packet.TYPE_NOTICE, msg);
				BroadCaster.broadCast(packet);
				writeLog(msg);
				
				saveNotice(msg);
				
				sp.getTfNoticeMsg().setText("");
			}
		});
		
		this.sp.getBtnSend().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String msg = sp.getTfNoticeMsg().getText().trim();
				if( msg.length() == 0 ) {
					JOptionPane.showMessageDialog(null, "�޼����� �Է��ؾ߸� �մϴ�.");					
					return;
				}
				
				Packet packet = new Packet(Packet.TYPE_NOTICE, msg);
				BroadCaster.broadCast(packet);
				writeLog(msg);
				
				saveNotice(msg);
				
				sp.getTfNoticeMsg().setText("");
			}
		});
		
		this.np.getBtnStartAndStop().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if( np.getBtnStartAndStop().getText().equals("����") ) {
					clientCollector.close();
					clientCollector = null;
					
					// ȸ������ ���� ����
					registClientCollector.close();
					registClientCollector = null;
					
					np.getBtnStartAndStop().setText("����");					
					return;
				}
				
				String strPort = np.getTfPortNumber().getText().trim();
				
				if( strPort.length() == 0 ) {
					JOptionPane.showMessageDialog(null, "��Ʈ��ȣ�� �Է��ؾ߸� �մϴ�.");					
					return;
				}
				
				int nPort = Integer.parseInt(strPort);
				clientCollector = new ClientCollector(frame, nPort);
				clientCollector.start();
				
				// ȸ������ ���� ����
				registClientCollector = new RegistClientCollector(frame);
				registClientCollector.start();
				
				np.getBtnStartAndStop().setText("����");
				
				Connection conn = JDBCConnection.getConnection();
				NoticeDAO dao = NoticeDAO.getInstance();
				ArrayList<Notice> noticeList = dao.select(conn);
				JDBCObjectManager.close(conn);
				writeLog(noticeList);
			}
		});
		
		setSize(500, 500);
		setVisible(true);
	}
	
	public void saveNotice(String msg) {
		Notice notice = new Notice(0, msg, null);
		
		Connection conn = JDBCConnection.getConnection();
		NoticeDAO dao = NoticeDAO.getInstance();
		dao.insert(conn, notice);
		JDBCObjectManager.close(conn);
	}
	
	public void noticeServerError() {
		np.getBtnStartAndStop().setText("����");
	}
	
	public synchronized void writeLog(String msg) {
		if( !this.cp.getCbLog().isSelected() )
			return;
		
		Date now = Calendar.getInstance().getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss : ");
		
		String output = String.format("%s%s\n", sdf.format(now), msg);
		this.cp.getTaLog().append(output);
		// TextArea�� ������ �߰��Ǹ� ���� ���������� �̵���Ŵ
		this.cp.getTaLog().setCaretPosition(this.cp.getTaLog().getDocument().getLength());
	}
	
	public synchronized void writeLog(ArrayList<Notice> list) {
		if( !this.cp.getCbLog().isSelected() )
			return;
				
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss : ");
		for( int i = list.size() - 1 ; i >= 0 ; i-- ) {
			String output = String.format("%s%s\n", 
					sdf.format(list.get(i).getDate()), 
					list.get(i).getMsg());
			this.cp.getTaLog().append(output);
			this.cp.getTaLog().setCaretPosition(this.cp.getTaLog().getDocument().getLength());	
		}
		
	}
	
	public static void main(String[] args) {		
		new ServerFrame();
	}

	class FileTransfer extends DropTargetAdapter {		
		public void drop(DropTargetDropEvent dtde) {		
			System.out.println("drop : " + dtde.getDropAction());
			if( (dtde.getDropAction() & DnDConstants.ACTION_COPY_OR_MOVE) != 0 ) {
			
				dtde.acceptDrop(dtde.getDropAction());
				Transferable tf = dtde.getTransferable();
				
				try {
					java.util.List list = (java.util.List) tf.getTransferData(DataFlavor.javaFileListFlavor);
					
					for( int i = 0 ; i < list.size() ; i++ ) {
						writeLog(list.get(i) + " ���� ���� ����");
						
						FileTransferThread ftt = new FileTransferThread((File)list.get(i));
						ftt.start();
						ftt.join();
						writeLog(list.get(i) + " ���� ���� ����");						
					}
					
				} catch(Exception e) {
					e.printStackTrace();
				}
			}
		}		
	}
}













