
public class Receipt extends Record{
	
	private int receiptNo;
	
	public Receipt(int receiptNo) {    //constructor
		this.receiptNo = receiptNo;
	}
	
	public int getReceiptNo() {
		return receiptNo;
	}
	
	public double Lucky() {
		double balance = 1000;
		balance += super.getBalance();
		return balance;
	}
	
	public String getInfo() {
		String s = "";
		s = "Current balance : " + (Lucky());
		return s;
	}
}



