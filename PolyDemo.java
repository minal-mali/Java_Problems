class PolyDemo
{
	void display()
	{
		System.out.println("Method Without arg");
	}
}
class Test extends PolyDemo
{
	void display(int id)
	{
		System.out.println("Method Without arg" + id);
	}
	public static void main(String args[])
	{
		PolyDemo d1= new PolyDemo();
		d1.display();
		d1.display(10);
	}	
}	
