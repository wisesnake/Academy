package collection_ex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class SynchronizedMapEx {

	public static void main(String[] args) {
		Map<Integer, String> map = Collections.synchronizedMap(new HashMap<>());
//		Map<Integer, String> map = new HashMap<>();
//		만약 map 객체 선언을 위와같이 synchro~~뭐시기로 선언하지 않을 경우, 여러 스레드에서 동시에 
//		put()메소드를 호출할 수 있는 HashMap의 특성 상, A와 B의 run()메소드가 동시에 실행되면서
//		둘끼리 경합이 발생하여 둘 중 하나만 저장되는 경우가 발생하기 때문이다.
//		(동기화 = 멀티스레드 X)

		Thread threadA = new Thread() {

			@Override
			public void run() {
				for (int i = 1; i <= 1000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		
		Thread threadB = new Thread() {
			
			@Override
			public void run() {
				for (int i = 1001; i <= 2000; i++) {
					map.put(i, "내용" + i);
				}
			}
		};
		
		threadA.start();
		threadB.start();
		
		try {
			threadA.join();
//			join() : Waits for this thread to die. 
			threadB.join();
		}catch(Exception e) {
		}
		int size = map.size();
		System.out.println("총 객체 수" + size);
	}

}
