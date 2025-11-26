interface A
{
	void displayA();	
}
interface B
{
	void displayB();
}
class C implements A,B
{
	void displayA()
	{
		System.out.println("Display from A");
	}
	void displayB()
	{
		System.out.println("Display from B");
	}
}
class MultipleInheritance
{
	{
		public static void main(String args[])
		C obj = new C();
		obj.displayA();
		obj.displayB();
	}
}