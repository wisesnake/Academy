package chpt15ex;

import java.util.ArrayList;
import java.util.List;

public class BoardDao{
	List<Board> list = new ArrayList<>();
	
	public BoardDao() {
		list.add(new Board("제목1", "내용1"));
		list.add(new Board("제목2", "내용2"));
		list.add(new Board("제목3", "내용3"));
	}
	
	
	public List<Board> getBoardList() {
		return list;
	}

}
