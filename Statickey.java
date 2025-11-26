class Statickey
{
	int id;
	String name;
	static String cname= "ABC";
	Statickey(int i,String n)
	{
		id=i;
		name= n;
			
	}
	void display()
	{
		System.out.println( id + " " + name);
	}

	public static void main(String args[])
	{
		Statickey s1 = new Statickey(1,"minal","XYZ");
		Statickey s2 = new Statickey(2,"shital","zxy");
		s1.display();
		s2.display();
	}
}