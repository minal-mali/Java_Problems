class StringSBDifference
{
	public static void main(String args[])
	{
		long startTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("java");
		for(int i=0; i<1000; i++)
		{
			sb.append("is easy");
		}
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis()-startTime));

		startTime = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("java");
		for(int i=0; i<1000; i++)
		{
			sb.append("is easy");
		}
		System.out.println("Time taken by StringBuffer:"+(System.currentTimeMillis)-startTime));	
	
	}
}
