package stream2;

import java.util.Arrays;

public class LoopingEx {

	public static void main(String[] args) {
		
		int intArr[]={1,2,3,4,5};
		
		Arrays.stream(intArr).filter((n)->{return n%2 ==0;}).forEach(s->{System.out.println(s);});
		System.out.println();
		
		//peek(Consumer 타입) 이 스트림의 요소로 구성된 스트림을 반환하며 결과 스트림에서 요소가 소비될 때
		//각 요소에 대해 제공된 작업을 추가로 수행.
		
		Arrays.stream(intArr)
		.filter((n)->{return n%2 ==0;})
		.peek(s->{System.out.println(s);});
		
		int tot = Arrays.stream(intArr)
				.filter((n)->{return n%2 ==0;})
				.peek(s->{System.out.println(s);})
				.sum();
		
		System.out.println(tot);
	}

}
