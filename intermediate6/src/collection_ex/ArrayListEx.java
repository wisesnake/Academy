package collection_ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Board> list = new ArrayList<Board>();
		
		for(int i = 1 ; i < 6; i++) {
		list.add(new Board("제목"+i, "내용"+i, "글쓴이"+i));
		}
		
		for(Board board : list) {
			String subject = board.getSubject();
			String content = board.getContent();
			String writer = board.getWriter();
			
			System.out.printf("%s|%s|%s \n",subject,content,writer);
		}
		
		System.out.println("iterator사용");
		
		Iterator<Board> iterator = list.iterator();
		
		while(iterator.hasNext()) {
			String all = iterator.next().getAll();
					
			System.out.println(all);
		}
		
		
	}

}
