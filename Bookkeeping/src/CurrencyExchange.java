
public class CurrencyExchange {
	
	private double cAmount;
	private String cCurrency, eCurrency;
	
	public CurrencyExchange(String cCurrency, String eCurrency, double cAmount) {
		this.cAmount = cAmount;
		this.cCurrency = cCurrency;
		this.eCurrency = eCurrency;
	}
	
	public String getCCurrency() {
		return cCurrency;
	}
	
	public void setCCurrency(String cCurrency) {
		this.cCurrency = cCurrency;
	}
	
	public double getCAmount() {
		return cAmount;
	}
	
	public void setcAmount(double cAmount) {
		this.cAmount = cAmount;
	}
	
	public String getECurrency() {
		return eCurrency;
	}
	
	public void setECurrency(String eCurrency) {
		this.eCurrency = eCurrency;
	}
	
	public double eAmount() {
		double result = 0;
		if(getCCurrency().toUpperCase().equals("TWD") && getECurrency().toUpperCase().equals("USD")) {
			result = this.cAmount * 0.033;
		}else if(getCCurrency().toUpperCase().equals("TWD") && getECurrency().toUpperCase().equals("EUR")) {
			result = this.cAmount * 0.031;
		}else if(getCCurrency().toUpperCase().equals("USD") && getECurrency().toUpperCase().equals("EUR")) {
			result = this.cAmount * 0.942;
		}else if(getCCurrency().toUpperCase().equals("USD") && getECurrency().toUpperCase().equals("TWD")) {
			result = this.cAmount * 30.694;
		}else if(getCCurrency().toUpperCase().equals("EUR") && getECurrency().toUpperCase().equals("TWD")) {
			result = this.cAmount * 32.601;
		}else if(getCCurrency().toUpperCase().equals("EUR") && getECurrency().toUpperCase().equals("USD")) {
			result = this.cAmount * 1.062;
		}else {
			result = 0;
		}
		
		return result;
	}
	
	public String getInfo() {
		String info = "";
		if(eAmount() == 0) {
			info += "Invalid Currency\n\n" + "Welcome to Currency Exchange press any key to continue or enter T to terminate";
		}else {
			info += String.format("%s %.2f = %s %.2f\n", this.cCurrency.toUpperCase(), this.cAmount, this.eCurrency.toUpperCase(), eAmount());
		}
		return info;
	}

}
