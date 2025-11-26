class Conparameter
{ 
	int id; 
	String name;
	Conparameter(int i , String n)
	{
		id = i;
		name = n;
	}
	void show()
	{
		System.out.println(id + " " + name);
	}
	public static void main(String args[])
	{
		Conparameter c1 = new Conparameter(101,"minal");
		Conparameter c2 = new Conparameter(102,"ritu");
		c1.show();
		c2.show();
	}
}