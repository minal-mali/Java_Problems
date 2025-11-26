class menu
{
	public static void main(String [] args)
{
	System.out.println("1. Cricket");
	System.out.println("2. Football");
	System.out.println("3. Vollyball");
	System.out.println("4. Badminton");
	System.out.println("5. Hockey");

	int ch = 4;
	
	switch (ch)
	{
	case 1:
	System.out.println("My fav game is Cricket");
	break;
	case 2:
	System.out.println("My fav game is Football");
	break;
	case 3:
	System.out.println("My fav game is Vollyball");
	break;
	case 4:
	System.out.println("My fav game is Badminton");
	break;
	case 5:
	System.out.println("My fav game is Hockey");
	break;
	default:
	System.out.println("Invalid Menu");
	break;
	}
}
}