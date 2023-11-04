package chpt16ex;

public class Ex4 {

	public static void main(String[] args) {
//		Thread thread = new Thread(() -> {
//			for(int i = 0 ; i < 3 ; i++) {
//				System.out.println("스레드 실행");
//			}
//		});
//		
//		thread.start();
		for(int i = 0 ; i < 3 ; i++) {
			Thread thread = new Thread(new Runnable() {
				@Override
				public void run() {
					System.out.println("스레드 실행");
				}
			});
			thread.start();
		}
	}

}
