
public class Bookkeeping extends Record{
	private String word;
	private double foodTotal = 0;
	private double rentTotal = 0;
	private double transportTotal = 0;
	
	public Bookkeeping (double amount) {
		setBalance(amount);
	}

	public String getWord() {
		return word;
	}
	
	public void setWord(String word) {
		this.word = word;
	}
	
	public void setFood(double money) {
		foodTotal += money;
		super.setBalance(super.getBalance() - money);
	}
	
	public void setRent(double money) {
		rentTotal += money;
		super.setBalance(super.getBalance() - money);
	}
	
	public void setTransport(double money) {
		transportTotal += money;
		super.setBalance(super.getBalance() - money);
	}
	
	public String getResult() {
		String s ="";
		s += "Total spending on " + getWord() + ":";
		if(this.word.equals("Food")) {
			s += foodTotal;
		}else if (this.word.equals("Rent")) {
			s += rentTotal;
		}else if (this.word.equals("Transport")) {
			s += transportTotal;
		}
		s += "\nCurrent balance : " + (super.getBalance());
		return s;
	}
}


