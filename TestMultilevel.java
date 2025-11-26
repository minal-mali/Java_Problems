class Employee 
{
	int salary=40000;
	String Company_name="FCTP";
	String Skill="Java";
}

class Programmer extends Employee
{
	int bonus=10000;
	String name="Radha";
}

class Jprogrammer extends Programmer
{
	int bonus=5000;
	String name="Kirti";
}


class TestMultilevel
{
	public static void main(String args[])
	{
		Jprogrammer p=new Jprogrammer();
		System.out.println("Name: "+p.name+" Salary: "+p.salary+" Bonus:" +p.bonus+" Company:  "+p.Company_name+"Skill: "+p.Skill); 
	}
}