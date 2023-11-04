package chpt15ex;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx {

	public static void main(String[] args) {
		Map<String,Integer> map = new HashMap<>();
		int val = 0;
		int totElements = 0;
		String best = "";
		map.put("blue", 96);
		map.put("hong", 86);
		map.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			val = map.get(key);
			if(maxScore < val) {
				maxScore = val;
				best = key;
			}
			totalScore += val;
		}
		
		
		
		System.out.println("평균 점수 : " + totalScore/3);
		System.out.println("최고 점수 : " + maxScore);
		System.out.println("최고 득점 : " + best);
	}

}
