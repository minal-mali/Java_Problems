class LargeSmall 
{
    	public static void main(String[] args)
	{
        int[] numbers = {25, 11, 7, 75, 56}; 
	int smallest = numbers[0];
        int largest = numbers[0];

        for (int num : numbers)
	{
        	if (num < smallest) 
	    	{
                	smallest = num;
           	}
            	if (num > largest) 
		{
                	largest = num;
            	}
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
    }
}
