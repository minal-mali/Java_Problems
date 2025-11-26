class Dog
{
	String name = "jeevdya"; // state - static data
	
	void bark()
	{
		System.out.println( name + "Bark");//Behaviour
	}

	public static void main (String [] args)
	{
		// classname nameofobject = new keyword  name of class with();
		Dog d1 = new Dog();
		d1.bark(); // calling
		System.out.println(d1.name);
	}
}