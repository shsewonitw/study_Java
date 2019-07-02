
public class ThreadExample8 {

	public static void main(String[] args) {
		Thread thread = new MovieThread8();
		thread.start();
		
		try {
			thread.sleep(1000);
		} catch (InterruptedException e) {
		
		}
		
		thread.interrupt();
	}

}
