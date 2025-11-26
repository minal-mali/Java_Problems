class trafficsignal
{
	public static void main(String [] args)
{
	String signal = "red";
	
	if(signal=="red")
	{
		System.out.println("Stop Its Red Signal");	
	}
	else if (signal == "yellow")
	{
 		System.out.println("Ready To Go Its Yellow Signal...");		
        }
	else if(signal == "green")
	{
		System.out.println("Go Now Its Green Signal ");	
	}
	else
	{
		System.out.println("Invalid Signal");
	}
}
}