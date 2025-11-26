class Products
{
	int pid;
	String pname;
	float pprice;
	Products(int pid, String pname, float pprice)
	{
		this.pid=pid;
		this.pname= pname;
		this.pprice=pprice;
	}
	public void display()
	{
		System.out.println("Product Id: " + pid+ "Product Name: " + pname + "Product Price: " + pprice);

	}
}
class ProductData
{
	public static void main(String args[])
	{
	Products obj[] = new Products[5];
	obj[0] = new Products(101,"phone",34353);
	obj[0] = new Products(102,"iphone",47003);
	obj[0] = new Products(101,"tphone",74353);
	obj[0] = new Products(101,"mphone",94353);
	obj[0] = new Products(101,"rphone",24353);
	obj[0].display();
	}
}