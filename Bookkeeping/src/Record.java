
public class Record {
	private double balance;
	
	
	public void setBalance(double amount) {
		balance = amount;
	}
	public void bookkeeping (double deposit) {
		balance += deposit;
	}
	
	public double getBalance() {
		return balance;
	}
	
}