package business;

public class Account implements Balanceable, Depositable, Withdrawable {

	// instance variable
	protected double balance;
	
	
	// constructor
	public Account(double balance) {
		super();
		this.balance = balance;
	}

	@Override
	public double withdraw(double amount) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getDeposit() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setBalance(double amount) {
		// set value for setter
		balance = amount;
	}

	public void deposit(double amount) {
		balance += amount;
	}
}
