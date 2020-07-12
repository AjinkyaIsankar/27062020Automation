package oops.abstraction;

public class BankUser {

	public static void main(String[] args) {
		
		account(new SBI());//SBI==Chrome
		account(new HDFC());//HDFC==Firefox
		account(new ICICI());//ICICI==Edge
		
		String name="Ajink";
		RBI bank=new ICICI();
		int a=10;
		
		sum(a);
		message(name);
		account(bank);
		
		sum(a);
		message("Ajink");
		account(new SBI());
		
		/*
		 * RBI bank1; bank1=new SBI();
		 * 
		 * bank1.creditCard(); bank1.debitCard(); bank1.currentAccount();
		 * bank1.savingAccount();
		 */
		
	}
	
	public void account(RBI bank) //RBI ==WebDriver
	{
		bank.creditCard();//Navigate
		bank.debitCard(); //Click
		bank.currentAccount();//Enter Data
		bank.savingAccount();//Select option
	}
	public static void sum(int a) 
	{
		System.out.println(10+a);
	}
	public static void message(String name) 
	{
		System.out.println("Your name is "+name);
	}
}
