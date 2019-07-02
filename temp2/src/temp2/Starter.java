package temp2;

public class Starter {

	public static void main(String[] args) {
		int port = 7070;
		ClientCollector collector = new ClientCollector(7070);
		collector.start();
		

	}

}
