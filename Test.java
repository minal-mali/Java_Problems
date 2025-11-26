class ConMethodd
{
void display(int a)
{
	System.out.println("Hello from display:" +a);
}
void show(int b)
{
	System.out.println("Hello from show:" +b);
	this.display(b);

}
}
class Test
{
	public static void main(String args[])
	{
		ConMethodd m1 = new ConMethodd();
		m1.show(10);
		ConMethodd m2 = new ConMethodd();
		m2.display(20);
	}
}