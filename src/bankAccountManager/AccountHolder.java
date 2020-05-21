package bankAccountManager;

public class AccountHolder {
String name;
String typeOfAccount;
double balance=0;
String accountNumber;
int noOfTransactions;


public AccountHolder(String name, String typeOfAccount) {
	super();
	this.name = name;
	this.typeOfAccount = typeOfAccount;
	
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getTypeOfAccount() {
	return typeOfAccount;
}

public void setTypeOfAccount(String typeOfAccount) {
	this.typeOfAccount = typeOfAccount;
}

public double getBalance() {
	return balance;
}

public void setBalance(double balance) {
	this.balance = balance;
}


public String toString()
{
	return  "\nAccount number:" +accountNumber+
			"\nName " +name+
			"\nType of Account " +typeOfAccount+
			"\nBalance " +balance;
}




public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}

public String displayInfo()
{
	return "Name: " +name+
			"\nAccount No: "+accountNumber+ 
			"\nBalance: " +balance;
}

public void depositSomeMoney(double amountToBeDeposited)
{
	balance = balance + amountToBeDeposited;
	System.out.println("You have successfully deposited amount " +amountToBeDeposited+  
			"\n Your updated balance is: " +balance+ " .");
}

public void withdrawSomeMoney(double amountToBeWithdrawn)
{
	if((balance==0) || (balance<amountToBeWithdrawn))
	{
		System.out.println("Sorry !! Insufficient balance. "
				+"Your balance is "+ +balance+
				". You cannot withdraw " +amountToBeWithdrawn+ " amount");
	}
	else
	{
		balance = balance - amountToBeWithdrawn;
		System.out.println("You have successfully withdrawn " +amountToBeWithdrawn+ " amount" +
		"Your updated balance is: " +balance+ " .");
	}
}


}