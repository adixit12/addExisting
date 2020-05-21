package bankAccountManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AccountRunner {
	
	static int accountGenerator=999;
	
	public static void main(String[] args)
	{
	Scanner scan = new Scanner(System.in);
	
	List<AccountHolder> list = new ArrayList<>();
	System.out.println("Please enter the number of depositors");
	int noOfDepositors = scan.nextInt();
	
	
	for(int i=0;i<noOfDepositors;i++)
	{
	  System.out.println("Please enter Name, Account type of the customer.");
	  AccountHolder account = new AccountHolder(scan.next(),scan.next());
	  list.add(account);
	  
	}
	
	for(int i=0;i<list.size();i++)
	{
		list.get(i).setAccountNumber(generateAccountNumber());
	}
	
	System.out.println("Congratulations you have successfully opened the account."+
			  "\n Plese find the details as below: ");
	System.out.println(list);
	
	System.out.println("\n Menu");
	System.out.println("1 --> Print Info");
	System.out.println("2 --> Add money");
	
	System.out.println("Please enter your choice: ");
	int choice = scan.nextInt();
	
	
	
	switch(choice)
	{
	
	case 1:
		System.out.println(list.get(scan.nextInt()).displayInfo());
	    break;
	case 2:
		System.out.println("Please enter amount to be added");
		list.get(scan.nextInt()).depositSomeMoney(scan.nextDouble());
		break;
	default:
		System.out.println("Bye bye");
		break;
	}
	
	scan.close();
	
  }
	
	public static String generateAccountNumber()
	{
		accountGenerator++;
		return "BA"+accountGenerator;	
	}
	
}
