class StringConcat
{
	public static void main(String args[])
	{
		String s1 = "Hello";
		String s2 = "Minal";
		String s4 = "Programmer";
		System.out.println(s1.concat(s2)); //standard method 
		String s3 = s1+s2; //using + operator
		System.out.println(s3);
		System.out.println("Length of String:" + s1.length());
		System.out.println("Character index:" + s4.charAt(4));
		System.out.println("Substring method:" + s4.substring(4,8));
		
	}
}
