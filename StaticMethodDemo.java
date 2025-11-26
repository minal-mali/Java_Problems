class StaticMethodDemo
{
	int emp_id; //10
	String ename; //ritu
	static String cname = "FCTP";

	StaticMethodDemo(int emp_id, String ename)
	{
		this.emp_id = emp_id;
		this.ename= ename; //remove this keyword
	}
	static void change()
	{
		//id = 103;	not change because they have not staic keyword
		//ename= "Jhon";
		cname = "FCTS";
	}
	void show()
	{
		//cname="FCTB";
		System.out.println(" Emp ID: " +emp_id+ " Emp Name: " +ename+ " Company Name: " +cname);
	}
	public static void main(String args[])
	{
		StaticMethodDemo d1 = new StaticMethodDemo(101,"Minal");
		StaticMethodDemo d2 = new StaticMethodDemo(102,"Divya");
		change();
		d1.show();
		d2.show();
	}
}