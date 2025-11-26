class ageweight
{
	public static void main(String [] args)
{
	int  age = 81;
	int weight = 50;
	if(age>18)
	{
		if(weight>=50)
		{
			System.out.println("Allow to donate blood");
		}
		else
		{
			System.out.println(" Didn't Allow to donate blood");
		}
	}
	else
	{
 			System.out.println("You are too young");
        }
}
}