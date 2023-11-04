package collection_ex;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Coin> stack = new Stack<>();
		
		stack.push(new Coin(100));
		stack.push(new Coin(10));
		stack.push(new Coin(50));
		stack.push(new Coin(500));
		
		while(!stack.isEmpty()) {
			Coin coin = stack.pop();
			System.out.println(coin.getVal());
		}
		
//		LIFO형태로 출력됨.
	}

}
