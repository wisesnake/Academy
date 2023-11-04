package chpt16ex;

public class Ex5 {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(()->{
			System.out.println("ok버튼을 클릭");
		});
		Button btnCn = new Button();
		btnOk.click();
		
		btnCn.setClickListener(()->{
			System.out.println("취소버튼을 클릭");
		});
		btnCn.click();
	}

}
