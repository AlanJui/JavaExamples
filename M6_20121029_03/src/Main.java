import java.util.Vector;

import DomainModel.BankAccount;
import Utility.MyUtility;


public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount alan = new BankAccount("Alan Jui", 100);
		BankAccount stacy = new BankAccount("Stacy Wu", 500);
		BankAccount amos = new BankAccount("Amos Jui", 2000);
		
		Vector<BankAccount> accountList = new Vector<BankAccount>();
		accountList.addElement(alan);
		accountList.addElement(stacy);
		accountList.addElement(amos);

		/* ========================================================== */
		/* 
		 * Print all accounts in accountList
		 */
		
		MyUtility.printBlankLine(2);    // Print two blank lines
		System.out.println("Print all accounts in accountList:");
		for (BankAccount account : accountList) {
			account.printAccount();
		}
		System.out.printf("The size of accountList = %d \n", accountList.size());

		/* ========================================================== */
		/*
		 * print object: alan
		 */
		MyUtility.printBlankLine(2);    // Print two blank lines
		System.out.println("Print object: alan  ==>");
		System.out.println("alan = " + alan);
		alan.printAccount();
		
		/* ========================================================== */
		/*
		 * 自 accountList , 以 index 印出 alan 物件
		 */
		Object obj = accountList.elementAt(0);

		MyUtility.printBlankLine(2);    // Print two blank lines
		System.out.println("Print object: alan by accountList.elementAt(0) ==>");
		System.out.println("obj = " + obj);

		accountList.elementAt(0).printAccount();

	}

}
