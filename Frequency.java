class Frequency
{
    	public static void main(String[] args) 
	{
        	int arr[] = {1, 2, 2, 3, 4, 3, 1, 2};
        	int freq[] = new int[7];
        	int count = 1;
		int visited = -1;

        	for (int i = 0; i < arr.length; i++) 
		{
            		
            		for (int j = 0; j<arr.length; j++) 
			{
                		if (arr[i]==arr[j]) 
				{
					count++;
					freq[j]=visited;
				}
                    	}
			if(freq[i]!=visited)
			freq[i]=count;

            	}
		for (int i=0; i<7; i++)
		{
			if(freq[i]!=visited)
			{
				System.out.println("Number:" + arr[i] + "Frequency:" + count);
			}
		}
		
    	}
}
