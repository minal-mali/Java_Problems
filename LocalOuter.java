class LocalOuter
{
	int a=50;
	public void display()
	{
		System.out.println(a);

		class LocalInner
		{
			void show()
			{
				System.out.println("Method of Inner Class");
			}
		}
		LocalInner l1 = new LocalInner();
		l1.show();
	}
	
	public static void main(String args[])
	{
		LocalOuter o = new LocalOuter();
		o.display();
	}
}
//Local inner class of inner class