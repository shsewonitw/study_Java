
public class Chatting {

	void startChat(String chatId) {
		final String nickName = chatId;
		Chat chat = new Chat() {
			public void start() {
				while(true) {
					String inputData = "�ȳ��ϼ���";
					String message = "[" + nickName + "]" + inputData;
					sendMessage(message);
				}
			}
		};
		chat.start();
	}
	
	class Chat {
		void start() {}
		void sendMessage(String message) {}
	}
}
