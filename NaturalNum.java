class NaturalNum
{
	public static void main(String args[])
	{
		int sum =0;
		int a[]= new int[10];
		System.out.println("Sum of first 10 natural numbers");

		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
		for(int j:a)
		{
			sum = sum + j;
		}
		System.out.println("Sum is:" +sum);
	}
}