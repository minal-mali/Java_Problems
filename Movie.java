class Movie
{
	String name = "Kantara";
	String language = "Hindi";
	void release()
	{
		System.out.println(name + " New Releases ");
		System.out.println(language + " Movie ");
	}
	public static void main(String args[])
	{
		Movie m1 =  new Movie();
		m1.release();
		
	}
}