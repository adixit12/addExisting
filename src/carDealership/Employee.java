package carDealership;

public class Employee{

	public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle)
	{
		if(finance == true)
		{
			double loanAmount= vehicle.getPrice() - customer.getcashOnHand();
			runCreditHistory(customer,loanAmount);
		}
		else if(vehicle.getPrice()<= customer.getcashOnHand())
		{
			processTransaction(customer, vehicle);
		}
		else
		{
			System.out.println("Please bring more money");
		}
	}
	
	
	public void runCreditHistory(Customer customer, double loanAmount)
	{
	  System.out.println("The customer has been approved loan of " +loanAmount);	
	}
	
	public void processTransaction(Customer customer, Vehicle vehicle) {
		System.out.println("The customer "+customer+ " has purchased the car. "
				+vehicle);
		//System.out.println(vehicle);
	}
	
}
