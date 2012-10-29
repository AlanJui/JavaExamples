package DomainModel;

public class BankAccount {

	private double balance;
	private String name;
	
	static double interest = 0.07;
	
	public BankAccount() {
		
	}
	
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
	}
	
	public void printAccount() {
		System.out.println("name = " + this.name);
		System.out.println("balance = " + this.balance);
		System.out.println("-------------------------------------------");
	}
	
	static public double fetchRate() {
		return interest;
	}
	
	public void deposit(double amount) {
		this.setBalance(this.getBalance() + amount);
	} 
	
	public void withdraw(double amount) {
		this.setBalance(this.getBalance() - amount);
	}

	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}

	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
