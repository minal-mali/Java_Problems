class day
{
	public static void main(String [] args)
{
	System.out.println("1. Monday");
	System.out.println("2. Tuesday");
	System.out.println("3. Wednesday");
	System.out.println("4. Thursday");
	System.out.println("5. Friday");
	System.out.println("6. Saturday");
	System.out.println("7. Sunday");

	int day = 4;
	
	switch (day)
	{
	case 1:
	System.out.println("1. Represents calmness, emotions, and the mind Fasting.");
	break;
	case 2:
	System.out.println("2. Symbolizes strength, courage, and protection");
	break;
	case 3:
	System.out.println("3. Represents intelligence, communication, and business");
	break;
	case 4:
	System.out.println("4. Associated with knowledge, wisdom, and prosperity.");
	break;
	case 5:
	System.out.println("5. Represents love, wealth, beauty, and material comforts.");
	break;
	case 6:
	System.out.println("6. Associated with discipline, justice, hard work, and karmic balance.");
	break;
	case 7:
	System.out.println("7. Associated with vitality, health, authority, and leadership.");
	break;
	default:
	System.out.println("Invalid day");
	break;
	}
}
}