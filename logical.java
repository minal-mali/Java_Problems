class logical{

	public static void main(String [] args)
{
	int no1 = 50;
	int no2= 10;
	System.out.println("Logical AND:" + ((no1>no2) && (no2<no1)));
	System.out.println("Logical OR:" + ((no1>no2) || (no2<no1)));
	System.out.println("Logical NOT:" + (!(no1>no2)));
	
}
}