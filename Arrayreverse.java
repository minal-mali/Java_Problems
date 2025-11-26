class Arrayreverse
{
	public static void main(String args[])
	{
		int arr[] = {2,3,5,6,7};
		System.out.println("Array data in insertion order");

		for(int i = 0; i<arr.length; i++)
		{	
			System.out.println(arr[i]);
		}
		System.out.println("Array data in reverse order");

		for(int i=arr.length-1;  i >= 0;  i--)
		{
			System.out.println(arr[i]);
		}
	}
}
//Task 5: Arrange all numbers of your array in ascending and descending order
//Task 6: Find out average of all elements in array
//Task 7: Copy data of one array to another
//Task 8: Search element in an array