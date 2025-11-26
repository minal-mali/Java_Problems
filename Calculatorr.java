class Calculatorr
{
	void add(int a, int b)
	{
		System.out.println(a+b);
	}
	void add(double a, double b)
	{
		System.out.println(a+b);
	}
	void add(int a, int b, int c)
	{
		System.out.println(a+b+c);
	}
	public static void main(String args[])
	{
		Calculatorr c1= new Calculatorr();
		c1.add(23,22);
		c1.add(22.3,45.2);
		c1.add(23,22,11);
	}
}