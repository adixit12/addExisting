package carDealership;

public class Vehicle {
	
	String modelName;
	String makeCompany;
	double price;
	
	public Vehicle(String modelName, String makeCompany, double price)
	{
		this.modelName=modelName;
		this.makeCompany=makeCompany;
		this.price=price;
	}
	
	
	public double getPrice()
	{
		return this.price;
	}
	
	public void setPrice(double price)
	{
		this.price = price;
	}
	
	public String toString()
	{
		return String.format("%s" , modelName);
	}
	

}
