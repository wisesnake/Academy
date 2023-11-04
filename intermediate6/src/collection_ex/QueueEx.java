package collection_ex;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		Queue<Message> message = new LinkedList<>();

		message.offer(new Message("sendSMS", "김길동"));
		message.offer(new Message("sendMail", "홍길동"));
		message.offer(new Message("sendKakao", "장길동"));

		while (!message.isEmpty()) {
			Message msg = message.poll();
			switch (msg.command) {
			case "sendMail":
				System.out.println(msg.to + "님에게 메일 보냄.");
				break;
			case "sendSMS":
				System.out.println(msg.to + "님에게 SMS 보냄.");
				break;
			case "sendKakao":
				System.out.println(msg.to + "님에게 카카오 보냄.");
				break;
			}
		}
		//출력순서 김 - 홍 - 장 으로 미루어보아,poll메소드는 먼저 offer한 순서대로 FIFO 형태로 저장된 데이터를 꺼내옴
		
	}

}
