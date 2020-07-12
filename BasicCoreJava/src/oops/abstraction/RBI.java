package oops.abstraction;

public interface RBI extends Modi,CB{
	//You cannot create object of an interface
	//You can achieve multiple inheritance in interface
	public void savingAccount();
	public void currentAccount();
	public void debitCard();
	public void creditCard();
	
	
}
