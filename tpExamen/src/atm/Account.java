package atm;
import java.util.Scanner;

public class Account{
	//attributes
	private double balance;
	Client client;
	
	//constructors
	public Account( double pBalance, Client client) {
		this.balance = pBalance;
		this.client = client;
	}
	
	//methods
	public void setBalance(double pBalance) {
		this.balance = pBalance;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setClient( Client pClient) {
		this.client = pClient;
	}
	
	public Client getClient() {
		return client;
	}
	
	public void deposit() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Montant a deposer: ");
		double argent = scan.nextDouble();
		
		if (argent <= 0) {
			System.out.print("Le montant ne peut pas etre inferieur a 0, reessayez.");
			System.out.print("Montant: ");
			argent = scan.nextDouble();
		} 
		setBalance(balance + argent);
		System.out.print("Votre solde est desormais de: "+ balance + "€");
	}
	
	public void withdraw() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Montant a retirer: ");
		double argent = scan.nextDouble();
		
		if (argent > balance) {
			System.out.print("Attention, vous depasez le montant de votre solde...");
			
			setBalance(balance - argent);
			System.out.print("Votre solde est desormais de: "+ balance + "€");
			System.exit(0);
		}
		setBalance(balance - argent);
		System.out.print("Votre solde est desormais de: "+ balance + "€");
	}
	
}
