package CustomerManagement;

public class Customer {
	
	//f
	
	private int custId;
	private String custName;
	protected String custGrade;
	int BonusPoint;
	double BonusRatio;

	//c
	
	public Customer() {
		custGrade = "SILVER";
		this.BonusRatio = 0.01;
		System.out.println("customer생성자호출");
	}

	//m
	
	public void setCustomerName(String custName) {
		this.custName = custName;
	}

	public String getCustomerName() {
		return this.custName;
	}

	public void setCustomerId(int custId) {
		this.custId = custId;
	}

	public int getCustomerId() {
		return this.custId;
	}

	public String getCustGrade() {
		return custGrade;
	}

	public void setCustGrade(String custGrade) {
		this.custGrade = custGrade;
	}
//=============여기까지 게터세터==========
	
	public int calcPrice(int price) {
		this.BonusPoint += price * BonusRatio;
		return price;
	}

	public String showCustInfo() {
		return this.custName + " 님의 등급은 " + this.custGrade + "이며, 보너스 포인트는 " + this.BonusPoint + "입니다.";
	}

}
