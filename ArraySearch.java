import java.util.Scanner;
class ArraySearch
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5];
		
		System.out.println("Enter 5 Elements:");
		 for(int i = 0; i<arr.length; i++) 
		{
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter Key Element");
		int key = sc.nextInt();
		boolean found = false;

		 for(int i = 0; i<arr.length; i++) 
		{
			if (arr[i]==key)
			{
				System.out.println("Array Element are found at:" + i);
				found = true;
				break;
			}	
		}
		if(found==false)
		System.out.println("Array Element are not found");
	}
}