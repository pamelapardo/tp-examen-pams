package atm;

public class Account{
	//attributes
	private int balance;
	
	//constructors
	public Account() {}
	
	public Account( int pBalance) {
		this.balance = pBalance;
	}
	
	//methods
	public void setBalance(int pBalance) {
		this.balance = pBalance;
	}
	
	public int getBalance() {
		return balance;
	}
}
