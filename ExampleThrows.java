class ExampleThrows 
{
    	void myMethod() throws IOException 
    	{
        	throw new IOException("File not found");
    	}
	public static void main(String[] args) 
	{
        	ExampleThrows obj = new ExampleThrows();
        	try 
		{
            		obj.myMethod();
        	} 
		catch (IOException e) 
		{
            		System.out.println(e);
       		}
    	}
}