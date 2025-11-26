class TestMutable
{
	public static void main(String args[])
	{
		String s1 = new String("Hello"); //immutable string
		s1.concat(" Minal");
		System.out.println(s1);
	
		StringBuffer s2 = new StringBuffer("hello"); //mutable string
		s2.append("Urvi");
		System.out.println(s2);
	}
}