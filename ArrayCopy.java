class ArrayCopy
{
	public static void main(String args[])
	{ 
		int arr1[] = {12,23,34,45,54};
		int arr2[] = new int[arr1.length];
		for(int i=0; i<arr1.length; i++)
		{
			arr2[i]=arr1[i];
		}
		System.out.println("Array Element");
		for(int i=0; i<arr1.length; i++)
		{
			System.out.println(arr1[i] + " ");	
		}
		System.out.println("Copy of Array Element");
		for(int i=0;i<arr2.length;i++)
		{
			System.out.println(arr2[i] + " ");	
		}
	}
}