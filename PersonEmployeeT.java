//Parent: Person(name)
//Child: Employee(name, salary)

class Person
{
	String name;
	Person(String name)
	{
		this.name = name;
		System.out.println("Name:" + name);
	}
}
class Employee extends Person
{
	double salary;
	Employee(String name, double salary)
	{
		super(name);
		this.salary=salary;
		System.out.println("Name:" + name +  "Salary:" + salary);
	}
}
public class PersonEmployeeT
{
	public static void main(String args[])
	{
		Employee e1 = new Employee("Minal",50.343);
	}
}
