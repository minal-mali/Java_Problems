class CopyArray 
{
    	public static void main(String args[]) 
	{
        	int arr1[] = {10, 20, 30, 40, 50};
        	int arr2[] = new int[arr1.length]; // create another array with same size

        	for (int i = 0; i < arr1.length; i++) 
		{
            		arr2[i] = arr1[i];	// Copy elements using for loop
        	}
	
        	System.out.println("Elements of original array:");
        	for (int i = 0; i < arr1.length; i++) // Display copied elements
		{
            		System.out.print(arr1[i] + " ");
        	}

        	System.out.println("\nElements of copied array:");
        	for (int i = 0; i < arr2.length; i++) 
		{
            		System.out.print(arr2[i] + " ");
        	}
    }
}
