class Book
{
	String name = "Fairytale";
	String booktype = "Story Book";
	String language = "English";
	void reading()
	{
		System.out.println(name + " for learning kids");
		System.out.println( booktype + " for reading ");
	} 
	public static void main(String args[])
	{
		Book b1 = new Book();
		b1.reading();
		System.out.println(b1.name);
		System.out.println(b1.language);
	}
}
