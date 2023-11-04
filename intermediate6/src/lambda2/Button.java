package lambda2;

public class Button {
	@FunctionalInterface
	static interface ClickListener{
		void onClick();
	}
	private ClickListener clickListener;
	
	public void setClickListener(ClickListener clickListener) {
		this.clickListener = clickListener;
	}
	
	void click() {
		this.clickListener.onClick();
	}
	
}
