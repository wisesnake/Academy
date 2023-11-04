package cust2;

public class VIPCustomer extends Customer {
	double saleRatio;
	int agentId;
	
	
	
	public VIPCustomer() {
		custGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}

	@Override
	public int calcPrice(int price) {
		bonusPt += price * bonusRatio;
		price -= (int)(price * saleRatio);
		return price;
	}
	
}
