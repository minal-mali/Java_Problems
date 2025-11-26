class StaticVariableDemo
{
	int emp_id; //10
	String ename; //ritu
	static String cname = "FCTP";
	StaticVariableDemo(int emp_id, String ename)
	{
		this.emp_id = emp_id;
		this.ename= ename;
	}
	void show()
	{
		System.out.println("Emp ID:" +emp_id+ "Emp Name:" +ename+ "Company Name:" +cname);
	}
	public static void main(String args[])
	{
		StaticVariableDemo d1 = new StaticVariableDemo(101,"Minal");
		StaticVariableDemo d2 = new StaticVariableDemo(101,"Divya");
	}
}