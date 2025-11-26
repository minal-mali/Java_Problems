class VehicleOverRide
{
	public void run()	
	{
		System.out.println("Hello from Parent Class Method");
	}	
}
class Bike extends VehicleOverRide
{
	public void run()	
	{
		System.out.println("Hello from Child Class Method");
	}
	public static void main(String args[])
	{
		 VehicleOverRide v1 = new  VehicleOverRide();
		 v1.run();
		
		
	}
}