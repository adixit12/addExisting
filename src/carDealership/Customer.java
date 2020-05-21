package carDealership;

public class Customer {

	String name;
	double cashOnHand;
	
	public Customer(String name, double cashOnHand)
	{
		this.name=name;
		this.cashOnHand=cashOnHand;
	}
	
   public void setName(String name)
   {
	   this.name=name;
   }
   
   public String getName()
   {
	   return name;
   }
   
   public void setcashOnHand(double cash)
   {
	   this.cashOnHand = cash;
   }
   
   public double getcashOnHand()
   {
	   return cashOnHand;
   }
   
   public void purchaseCar(Vehicle vehicle, Employee employee, boolean finance)
   {
	   employee.handleCustomer(this, finance, vehicle);
   }
   
   public String toString()
   {
	   return String.format("%s",name);
   }
}
