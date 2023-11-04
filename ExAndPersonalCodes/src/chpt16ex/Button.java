package chpt16ex;


public class Button {
	@FunctionalInterface
	static interface ClickListener{
		void onClick();
	}
	//필
	private ClickListener clickListener;
	
	//생
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	//메
	void click() {
		this.clickListener.onClick();
	}
	
}
