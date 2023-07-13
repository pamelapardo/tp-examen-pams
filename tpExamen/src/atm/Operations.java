package atm;

public class Operations {
	Account account;
	private int deposit;
	private int withdrawal;
	
	//constructors
	public Operations() {};
	
	public Operations(Account pAccount, int pDeposit, int pWithdrawal) {
		this.account = pAccount;
		this.deposit = pDeposit;
		this.withdrawal = pWithdrawal;
	}
	
	//methodes
	public void setAccount(Account pAccount) {
		this.account = pAccount;
	}
	public Account getAccount() {
		return account;
	}
	
	public void setDeposit(int pDeposit) {
		this.deposit = pDeposit;
	}
	public int getDeposit() {
		return deposit;
	}

	public void setWithdrawal(int pWithdrawal) {
		this.withdrawal = pWithdrawal;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
	}
