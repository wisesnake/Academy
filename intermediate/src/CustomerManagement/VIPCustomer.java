package CustomerManagement;

public class VIPCustomer extends Customer {
//	private int custId;
//	private String custName;
//	private String custLvl;
//	int BonusPoint;
//	double BonusRatio;
	
	int agentID; // VIP 고객 전문상담원
	double saleRatio; // VIP고객 할인율
	
	
	public VIPCustomer() {
		custGrade = "VIP";
		
		BonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("vipcustomer생성자호출");
	}

	public int calcPrice(int price) {
		BonusPoint += price * BonusRatio;
		return price - (int)(price * saleRatio);
	}

	public int getAgentId() {
		return agentID;
	}
	
//	public String showCustInfo() {
//		return this.custName + " 님의 등급은 " + this.custGrade + "이며, 보너스 포인트는 " + this.BonusPoint + "입니다.";
//	}
	
}
