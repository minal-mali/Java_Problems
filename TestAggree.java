class Address
{
	String city,state,country;
	Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
}

class Emp
{
	int empid;
	String empname;
	Address eaddress;

	Emp(int empid,String empname,Address eaddress)
	{
		this.empid=empid;
		this.empname=empname;
		this.eaddress=eaddress;
	}
	
	void display()
	{
		System.out.println(empid+" "+empname);
		System.out.println(eaddress.city+" "+eaddress.state+" "+eaddress.country);
	}
}

class TestAggree
{
	public static void main(String args[])
	{
		Address a1=new Address("Pune","Maharashtra","India");
		Emp e1=new Emp(101,"Minal",a1);
		e1.display();
	}
	 
}