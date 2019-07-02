package tje.thread;

//ÇÁ·Î±×·¥ÀÇ ¼öÇà Áß µ¿½Ã¿¡ Ã³¸®ÇÏ°íÀÚ ÇÏ´Â ÀÛ¾÷ÀÌ »ı°åÀ» ¶§´Â
//java.lang.Thread Å¬·¡½º¸¦ »ç¿ëÇÒ ¼ö ÀÖ½À´Ï´Ù.

//Thread
//ÇÁ·Î±×·¥ ½ÇÇàÀÇ Èå¸§À» ºĞ±âÇÒ ¼ö ÀÖ´Â ¹æ¹ıÀ» Á¦°øÇÏ´Â Å¬·¡½º
//ex) OSÀÇ ¸ÖÆ¼ÅÂ½ºÅ·

//±¸Çö¹æ¹ı
//1. Thread Å¬·¡½º¸¦ »ó¼Ó¹Ş´Â ¹æ¹ı
//1-1. Thread Å¬·¡½º¸¦ »ó¼Ó¹Ş¾Æ public void run() ¸Ş¼Òµå¸¦ ¿À¹ö¶óÀÌµù
//   ÇÕ´Ï´Ù.
//	    public void run() : ¾²·¹µå°¡ »ı¼ºµÇ¾î ¼öÇàÇÒ ÀÛ¾÷À» Á¤ÀÇÇÏ´Â ¸Ş¼Òµå
//1-2. ÇØ´ç Å¬·¡½ºÀÇ °´Ã¼¸¦ »ı¼ºÇÏ°í, start ¸Ş¼Òµå¸¦ ½ÇÇàÇÕ´Ï´Ù.
//		¿À¹ö¶óÀÌµùÇÑ run ¸Ş¼Òµå¸¦ È£ÃâÇÏ¸é, ¾²·¹µå°¡ »ı¼ºµÇ´Â °ÍÀÌ ¾Æ´Ñ
//   ÀÏ¹İ ¸Ş¼Òµå¸¦ ¼öÇàÇÕ´Ï´Ù.

//2. Runnable ÀÎÅÍÆäÀÌ½º¸¦ ±¸ÇöÇÏ´Â ¹æ¹ı

class Thread_C_1 extends Thread {
	public void run() {
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.printf("Thread_C_1 -> i = %d\n", i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}
class Thread_C_2 extends Thread {
	public void run() {
		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.printf("Thread_C_2 -> i = %d\n", i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}

public class Thread_03 {
	public static void main(String[] args) {
		
		Thread_C_1 c1 = new Thread_C_1();
		Thread_C_2 c2 = new Thread_C_2();
		
		// Thread Å¬·¡½ºÀÇ start ¸Ş¼Òµå´Â ÇöÀç °´Ã¼¸¦
		// »ç¿ëÇÏ¿© ¾²·¹µå¸¦ »ı¼ºÇÑ ÈÄ, run ¸Ş¼Òµå¸¦ È£­ŒÇÏ¿©
		// ÇØ´ç ¾²·¹µå°¡ µ¿ÀÛÇÒ ¼ö ÀÖµµ·Ï ¼öÇàÇÏ´Â ¸Ş¼Òµå
		c1.start();
		
		c2.start();

		for( int i = 1 ; i <= 10 ; i++ ) {
			System.out.printf("main -> i = %d\n", i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {				
				e.printStackTrace();
			}
		}
	}
}













