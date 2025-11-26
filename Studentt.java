class Studentt
{
	int id;
	String name;
	double marks;
	public Studentt(int i , String n , double m)//parameterized constructor
	{
		id = i;
		name = n;
		marks = m;
	}
	public void display()
	{
		System.out.println("ID :" + id + " Name : " + name + " Marks : " + marks );
	}
	public static void main (String args[])
	{
		Studentt s1 = new Studentt(104, "Ritu", 78.55);
		s1.display();
		Studentt s2 = new Studentt(103, "Minal", 61.34);
		s2.display();
	}
}