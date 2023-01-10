
public class Budget extends Record{
	private double budget=5000;

	
	public Budget(double balance) {
		setBalance(balance);
	}
	
	public String checkBudget(double cost) { 
		String warnBudget;
		if (cost<=budget) {
			warnBudget=String.format("Your spending is %.1f$ over the budget.",cost-budget);
		}
		else if(cost>budget) {
			warnBudget=String.format("You still have %.1f$ to spend.",budget-cost);
		}
		else {
			warnBudget="Be aware!You have just make your ends meet.";
		}
		return warnBudget;
	}
}
	