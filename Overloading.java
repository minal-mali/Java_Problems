class Overloading
{
	void show()
	{
		System.out.println("Welcome to Overloading");
	}
	void show(String name)
	{
		System.out.println(name+ " Welcome to Overloading ");
	}
	void show(String name, String city)
	{
		System.out.println(name+ " Welcome to Overloading from " +city );
	}
	public static void main(String args[])
	{
		Overloading o1 = new Overloading();
		o1.show();
		o1.show("Minal");
		o1.show("Minal","Pune");

	}
}
