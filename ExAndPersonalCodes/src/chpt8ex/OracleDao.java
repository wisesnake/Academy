package chpt8ex;

public class OracleDao implements DataAccessObject{

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB에서 삭제");
	}

	@Override
	public void insert() {
		// TODO Auto-generated method stub

		System.out.println("Oracle DB에 삽입");
	}

	@Override
	public void select() {
		// TODO Auto-generated method stub

		System.out.println("Oracle DB에서 검색");
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Oracle DB을 수정");

	}
}
