class Student
{
	int id;
	String name;
	double marks;
	public Student()
	{
		//default constructor are used to set default values of variable and state
	}
	public void display()
	{
		System.out.println("ID :" + id + " Name : " + name + " Marks : " + marks );
	}
	public static void main (String args[])
	{
		Student s1 = new Student();
		s1.display();
		Student s2 = new Student();
		s2.display();
	}
}