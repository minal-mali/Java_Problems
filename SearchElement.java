import java.util.Scanner;
class SearchElement 
{
    public static void main(String args[]) 
	{
        	int arr[] = {10, 20, 30, 40, 50};

        	Scanner sc = new Scanner(System.in);
		System.out.print("Enter element to search: ");
        	int search = sc.nextInt();

        	boolean found = false;

        	// Search for the element
        	for (int i = 0; i < arr.length; i++) 
		{
            		if (arr[i] == search) 
			{
                		System.out.println(search + " found at position " + (i + 1));
                		
            		}
        	}
   	 }
}
