package tje.chat.common;

import java.io.Serializable;

public class Packet implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int TYPE_NOTICE = 1;
	public static final int TYPE_NEW_CLIENT = 2;
	public static final int TYPE_DISCONECT_CLIENT = 3;
	public static final int TYPE_CLIENT_MSG = 4;

	// �������� Ÿ��
	// 1. �����޼��� / 2. ������ ���Ӱ� ������ Ŭ���̾�Ʈ�� ����
	// 3. ������ ������ ����� Ŭ���̾�Ʈ�� ����
	// 4. Ŭ���̾�Ʈ ���� �޼���
	private int packetType;
	private Object packetData;
	private String targetIp;
	private String sourceIp;
	private String sourceNickName;

	public Packet(int packetType, Object packetData) {
		this.packetType = packetType;
		this.packetData = packetData;
	}
	
	public Packet(int packetType, Object packetData, String targetIp, String sourceIp, String sourceNickName) {
		this(packetType, packetData);
		this.targetIp = targetIp;
		this.sourceIp = sourceIp;
		this.sourceNickName = sourceNickName;
	}
	
	public String getSourceIp() {
		return sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public String getSourceNickName() {
		return sourceNickName;
	}

	public void setSourceNickName(String sourceNickName) {
		this.sourceNickName = sourceNickName;
	}

	public String getTargetIp() {
		return targetIp;
	}

	public void setTargetIp(String targetIp) {
		this.targetIp = targetIp;
	}

	public int getPacketType() {
		return packetType;
	}

	public void setPacketType(int packetType) {
		this.packetType = packetType;
	}

	public Object getPacketData() {
		return packetData;
	}

	public void setPacketData(Object packetData) {
		this.packetData = packetData;
	}

}
