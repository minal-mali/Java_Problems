class AscendingDescending 
{
	public static void main(String[] args) 
	{
        	int[] arr = {5, 2, 9, 1, 7};
        	int temp = 0;

        	for (int i = 0; i < arr.length; i++) 
		{
           		for (int j = i + 1; j < arr.length; j++) 
			{
                	if (arr[i] > arr[j]) 
			{
                		temp = arr[i];
                		arr[i] = arr[j];
                		arr[j] = temp;
			}
        	 }
	}
	System.out.print("Ascending order: ");
       	for (int i = 0; i < arr.length; i++) 
	{
        	System.out.print(arr[i] + " ");
        }

        System.out.print("\nDescending order: ");
        for (int i = arr.length - 1; i >= 0; i--) 
	{
            System.out.print(arr[i] + " ");
        }
    }
}
