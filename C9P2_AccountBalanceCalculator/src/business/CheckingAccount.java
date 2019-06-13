package business;

public class CheckingAccount extends Account {
	private double monthlyFee;

	//generate via source
	public CheckingAccount(double balance, double monthlyFee) {
		super(balance);
		this.monthlyFee = monthlyFee;
	}
	
	//generate via source
	public double getMonthlyFee() {
		return monthlyFee;
	}
	

	public void subtractMonthlyFee() {
		balance -= monthlyFee;
	}


}
