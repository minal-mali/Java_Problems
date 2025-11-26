import package1.Student;
class TestStudent
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.setId(101);
		s1.setName("Minal");
		s1.setCity("Pune");

		System.out.println(s1.getId());	
		System.out.println(s1.getName());
		System.out.println(s1.getCity());
	}
}