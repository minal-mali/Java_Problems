class ExceptionTryCatch
{
    public static void main(String args[])
    {
        try
        {
            int[] arr = new int[5];
	    	try{   
            		arr[7] = 30/5; 
	       	}
	  	catch(ArithmeticException e)
		{
			System.out.println(e);
		}  
		String s = null;
		System.out.println(s.length());      
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
	System.out.println("rest of the code");
    }
}
