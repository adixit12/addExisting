package carDealership;

public class Dealership {

	//public static void carPurchase(Vehicle vehicle, Employee employee, boolean finance);
	
	public static void main(String[] args) {
		Customer cust1 = new Customer("Tom",12000);
		Vehicle vehicle = new Vehicle("Accord","Honda",10000);
		Employee employee = new Employee();
		
		
		cust1.purchaseCar(vehicle, employee, false);
		

		
		
		
	}

}
