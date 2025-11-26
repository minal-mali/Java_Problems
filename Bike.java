class VehicleOverRide
{
	public int run()	
	{
		System.out.println("Hello from Parent Class Method");
		return 0;
	}	
}
class Bike extends VehicleOverRide
{
	public int run()	
	{
		System.out.println("Hello from Child Class Method");
		return 0;
	}
	public static void main(String args[])
	{
		VehicleOverRide v1 = new  VehicleOverRide();
		v1.run();
		Bike b1 = new Bike();
		b1.run();
	}
}