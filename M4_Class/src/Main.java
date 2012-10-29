import DomainModel.BankAccount;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 探視物件剛建立時的初始值
		 */
		BankAccount myAccount = new BankAccount();

		System.out.println("==========================================");
		System.out.println("myAccount ==>");
		System.out.println("name = " + myAccount.getName());          // 查姓名
		System.out.println("balance = " + myAccount.getBalance());    // 查存款餘額
		System.out.println("interest = " + BankAccount.fetchRate());  // 查閱利潤
		
		/*
		 * 設定帳戶所有人姓名及存入$100元
		 */
		myAccount.setName("居正中");
		myAccount.deposit(100);
		
		System.out.println("==========================================");
		System.out.println("myAccount ==>");
		System.out.println("name = " + myAccount.getName());
		System.out.println("balance = " + myAccount.getBalance());
		
		/*
		 * 設定帳戶存入$500元；及提款$200元
		 */
		myAccount.deposit(500);
		myAccount.withdraw(200);
		
		System.out.println("==========================================");
		System.out.println("myAccount ==>");
		System.out.println("name = " + myAccount.getName());
		System.out.println("balance = " + myAccount.getBalance());
		
		/*
		 * 以傳參數的建構子，建立物件
		 */
		BankAccount stacyAccount = new BankAccount("Stacy Wu", 500.0);
		
		System.out.println("==========================================");
		System.out.println("Account of Stacy ==>");
		System.out.println("name = " + stacyAccount.getName());
		System.out.println("balance = " + stacyAccount.getBalance());
		
	}

}
