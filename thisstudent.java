class Thisstudent
{
	int id;
	String name;
	double marks;
	public Thisstudent(int id , String name , double marks)//parameterized constructor
	{
		//id=id;
		this.id = id;  //using this keyword
		this.name = name;
		this.marks = marks;
	}
	public void display()
	{
		System.out.println("ID :" + id + " Name : " + name + " Marks : " + marks );
	}
	public static void main (String args[])
	{
		Thisstudent s1 = new Thisstudent(104, "Ritu", 78.55);
		s1.display();
		Thisstudent s2 = new Thisstudent(103, "Minal", 61.34);
		s2.display();
	}
}