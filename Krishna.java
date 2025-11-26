class Krishna
{
	int id;
	String name;
	static String college = "ABC college";
	
	Krishna(int i, String n)
	{
		id=i;
		name = n;
	}
	void display()
	{
		System.out.println(id + " " + name + " " + college );
	}
	public static void main(String args[])
	{
		Krishna s1 = new Krishna(1,"XYZ");
		Krishna s2 = new Krishna(2,"abc");
		s1.display();
		s2.display();
	}
}