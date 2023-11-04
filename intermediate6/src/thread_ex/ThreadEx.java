package thread_ex;

public class ThreadEx {

	public static void main(String[] args) {

		Thread thread1 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(2000);
						System.out.println("쾅");
					} catch (Exception e) {

					}
				}
			}
		});

		System.out.println("=============");
		
		Thread thread2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for (int i = 0; i < 5; i++) {
					try {
						Thread.sleep(1000);
						System.out.println("1펑");
					} catch (Exception e) {
						
					}
				}
			}
		});
		thread1.start();
		thread2.start();
		
		
	}
}
