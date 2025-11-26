class electricity
{
	public static void main(String [] args)
{
	int unit = 200;
	
	if(unit<100)
	{
		System.out.println("Electricity Bill is low");	
	}
	else if ((unit>100)&&(unit<=200))
	{
 		System.out.println("Electricity Bill is medium");		
        }
	else if(unit>300)
	{
		System.out.println("Electricity bill is high");	
	}
	else
	{
		System.out.println("Something wrong in unit");
	}
}
}