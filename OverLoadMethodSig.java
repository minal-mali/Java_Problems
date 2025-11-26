class OverLoadMethodSig
{
	void show(int id)//Method Signature
	{
		System.out.println(" Welcome to Overloading ");
	}
	void show(String id)
	{
		System.out.println(" Welcome to Overloading ");
	}
	public static void main(String args[])
	{
		OverLoadMethodSig o1 = new OverLoadMethodSig();
		o1.show(10);
		o1.show("Minal");
	}
}
