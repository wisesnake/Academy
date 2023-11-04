package basic;

public class forEx3 {

	public static void main(String[] args) {
		//0831
		
		for(int i = 0 ;i < 10 ;i++) {
			//어떤 상황이 벌어지면 멈추라는 말이 자연스러우므로 어떤 상황에 해당하는 조건을 걸어 줄 것. -> if문
			
			System.out.println(i);
			if(i == 5) {
				break;
			}
		}
		
	}

}
