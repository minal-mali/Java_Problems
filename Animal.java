class Animal
{
	String name = "Ginni"; 
	String color = "white";
	void cat()
	{
		System.out.println( name + " Meowwww ");
		System.out.println( color + " Ginni ");

	}

	public static void main (String [] args)
	{
		
		Animal a1 = new Animal();
		a1.cat();
		System.out.println(a1.name);
		
		System.out.println(a1.color);
	}
}