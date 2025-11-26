class Outer
{
	int a=50;
	public void display()
	{
		System.out.println(a);
	}
	class Inner
	{
		void show()
		{
			System.out.println("Method of Inner Class");
		}
	}
	public static void main(String args[])
	{
		Outer o = new Outer();
		Outer.Inner in = o.new Inner();
		in.show();
		o.display();
	}
}
//Member inner class of inner class