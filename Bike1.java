class Vehical
{
	int chesisno;
	String vehicalType;
	public Vehical(int chesisno,String vehicalType)
	{
		this.chesisno= chesisno;
		this.vehicalType = vehicalType;
	}
}
class Bike1 extends Vehical
{
	String color;
	public Bike1(int chesisno, String vehicalType, String color)
	{
		super(chesisno, vehicalType);
		this.color=color;
	}
	void show()
	{
		System.out.println(super.chesisno+ " " +vehicalType+ " " +color);
	}
	public static void main(String args[])
	{
		Bike1 b1 = new Bike1(1000, "Thar", "Black");
		b1.show();
	}
}