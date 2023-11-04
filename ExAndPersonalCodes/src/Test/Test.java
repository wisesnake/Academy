package Test;

public class Test {

	public static void main(String[] args) {
		String query=
				
				
				"select *"
				+ " from (select rownum as rownum2, lvl, articleno, parentno, title, content,  id, writedate "
				+ "      from  ( select level as lvl,articleno, parentno, lpad(' ', 2*(level-1))||title as  title, content,  id, writedate "
				+ "               from t_board "
				+ "               start with parentNO=0 "
				+ "               CONNECT by prior articleno = parentno "
				+ "               order siblings by articleno desc)) "
				+ " where rownum2 between(?-1)*100+(?-1)*10+1 and (?-1)*100+?*10" ;
		
		
		   System.out.println(query);
	}

}
