
public class ThreadExample10 {

	public static void main(String[] args) {

		Thread thread = new MovieThread10();
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
