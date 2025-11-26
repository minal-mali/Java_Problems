class Methoddemo2
{
	public void display()
	{
		System.out.println("This is userdefine normal method"); 
		//can be executed with the help object
	}
	static void gout()
	{
		System.out.println("Userdefine Static Method");	
		//can be executed without the help of object
	}
	public static void main(String args[])
	{
		Methoddemo2 m1 = new Methoddemo2();
		m1.display();
		gout();
	}
}