class practice
{
    	void myMethod() throws IOException 
    	{
        	throw new IOException("File not found");
    	}
	public static void main(String[] args) 
	{
        	practice obj = new practice();
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