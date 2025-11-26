class Constructorm
{
	int id;
	String name;
	Constructorm()
	{
		 id = 101;
		 name = "Minal";
	}
	void display()
	{
        	System.out.println(id + " " + name);
    	}
	public static void main(String args[])
	{
		Constructorm c1 = new Constructorm();
		c1.display();
	}
}