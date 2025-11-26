class Employee
{
	int salary=40000;
	String Company_name="FCTP";
}

class Programmer extends Employee
{
	int bonus=10000;
	String name="Radha";
}

class -
{
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		System.out.println("Name: "+p.name+" Salary: "+p.salary+" Bonus:" +p.bonus+" Company: "+p.Company_name);			 
	}
}