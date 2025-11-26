class AverageArray 
{
   	public static void main(String args[]) 
	{
        	int arr[] = {10, 20, 30, 40, 50};
        	int sum = 0;
        	for (int i = 0; i < arr.length; i++) 
		{
            		sum = sum + arr[i];
        	}
        	int average = sum / arr.length; //arraylength = 7

        	System.out.println("Sum of array elements: " + sum);
       		System.out.println("Average of array elements: " + average);
    	}	
}
