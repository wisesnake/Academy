package collection_ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapEx {

	public static void main(String[] args) {
		Map <String,Integer> map= new HashMap<>();
		
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);
		map.put("임슬범", 100);
		// 키가 중복될 경우, 덮어씌움. "홍길동" 의 90은 95로 대체됨.
		
		System.out.println("총 Entry 수:" + map.size());
		
		int score = map.get("홍길동");
		System.out.println(score);
		
		//전체를 출력
		//향상for문은 불가, 키-밸류 형태를 담은 Map.Entry형태이므로 키와 값을 각각 받아서 뽑아야 하기 때문.
		
		//2-1 키뽑기
		Set<String> keySet = map.keySet();
		System.out.println("제거하기 전");
		System.out.println(keySet);
		//[홍길동, 신용권, 동장군] 형태로 출력, key를 Set 형태로 뽑은 상태임
		//2-2 밸류뽑기, iterator객체 이용해야함.
		// 밸류부터 뽑기 위해서는 키를 알아야 하므로, 키셋을 iterator객체로 만들어서 뽑을 수 밖에 없음.
		Iterator<String> iterator = keySet.iterator();
		//iterator() 메서드는 해당 반복자 객체의 컬렉션의 처음을 가리키는 포인터 역할을 함.
		//Iterator는 Java에서 컬렉션을 순회하며 원소를 하나씩 접근할 때 사용되는 인터페이스.
		
		while(iterator.hasNext()) {
			//포인터가 요소를 가르키는지 여부 불리언 리턴, 없으면 false
			String key = iterator.next();
			//반복자객체를 통해서 키를 하나씩 뽑아냄. 그리고 포인터는 다음 요소로 이동
			Integer val = map.get(key);
			//그렇게 뽑아낸 키를 이용해 get매서드를 통해서 값 뽑아냄.
			
			if(key.equals("임슬범")) {
				iterator.remove();
				//반복자를 이용한 특정 객체 찾아서 제거하는 방법.
				continue;
			}
			
			System.out.println(key + " : " + val);
			
		}
		System.out.println("제거 후 요소의 수 : " + map.size());
		
	}

}
