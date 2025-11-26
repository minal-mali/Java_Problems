class Employee 
{
	int salary=40000;
	String Company_name="FCTP";
	String Skill="Java";
}

class Programmer extends Employee
{
	int bonus=10000;
	String name="Ritu";
}

class Tester extends Employee
{
	int bonus=5000;
	String name="Minal";
	String Skill="Selenium";
}


class TestHeirarchical
{
	public static void main(String args[])
	{
		Programmer p=new Programmer();
		System.out.println("Name: "+p.name+" Salary: "+p.salary+" Bonus:" +p.bonus+" Company: "+p.Company_name+" Skill: "+p.Skill); 

		Tester p1=new Tester();
		System.out.println("Name: "+p1.name+" Salary: "+p1.salary+" Bonus:" +p1.bonus+" Company: "+p1.Company_name+" Skill: "+p1.Skill); 

	}
}