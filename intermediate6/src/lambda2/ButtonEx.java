package lambda2;

import lambda2.Button.ClickListener;

public class ButtonEx {

	public static void main(String[] args) {

		Button btnOk = new Button();
//		
//		btnOk.setClickListener(new ClickListener() {
//			
//			@Override
//			public void onClick() {
//				System.out.println("확인 버튼 누름.");
//			}
//		});

		btnOk.setClickListener(() -> {
			System.out.println("확인 버튼 누름");
		});

		btnOk.click();

		Button btnCancel = new Button();

//		btnCancel.setClickListener(new ClickListener() {
//
//			@Override
//			public void onClick() {
//				System.out.println("취소 버튼 누름");
//			}
//		});
		btnCancel.setClickListener(()->{
			System.out.println("취소 버튼 누름");
		});
		btnCancel.click();
	}

}
