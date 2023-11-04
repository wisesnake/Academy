package cust2;

public class Customer {
	//f
	private int custId;
	private String custName;
	protected String custGrade;
	int bonusPt;
	double bonusRatio;
	
	
	//c
	public Customer(){
		custGrade = "SILVER";
		bonusRatio = 0.01;
	}
	
	
	
	//getters and setters
	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustGrade() {
		return custGrade;
	}

	public void setCustGrade(String custGrade) {
		this.custGrade = custGrade;
	}
	
	//m
	public int calcPrice(int price) {
		bonusPt += price * bonusRatio;
		return price;
	}
	
	public void showCustInfo() {
		System.out.printf("<%s 님의 정보> \n",this.custName);
		System.out.printf("성함 : %s \n",this.custName);
		System.out.printf("등급 : %s \n",this.custGrade);
		System.out.printf("포인트: %d \n",this.bonusPt);
	}
}
