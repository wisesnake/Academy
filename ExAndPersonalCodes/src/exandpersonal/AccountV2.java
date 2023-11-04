package exandpersonal;

public class AccountV2 {
    private String accNum;
    private String accOwnerName;
    private int balance;

    public AccountV2(String accNum, String accOwnerName, int initialTransfer) {
        this.accNum = accNum;
        this.accOwnerName = accOwnerName;
        this.balance = initialTransfer;
    }

    public String getAccNum() {
        return accNum;
    }
    
    public void setAccNum(String accNum) {
    	this.accNum = accNum;
    }

    public String getAccOwnerName() {
        return accOwnerName;
    }
    
    public void setAccOwnerName(String accOwnerName) {
    	this.accOwnerName = accOwnerName;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
    	this.balance = balance;
    }

    public String getAccInfo() {
        return this.accNum + " | " + this.accOwnerName + " | " + this.balance;
    }
}
