class Mobile
{
	String name = "Vivo";
	int storage = 128 ;
	void calling()
	{
		System.out.println(name + " Making a call ");
		System.out.println(storage + " GB for storing data ");
	}
	public static void main(String args[])
	{
		Mobile m1 =  new Mobile();
		m1.calling();
		
	}
}