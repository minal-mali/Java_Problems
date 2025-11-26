class Fibonacci
{
	public static void main(String args[])
	{
		int n=10;
		int x = 0; int y= 1; int z=0;
		while(z<=n)
		{
			System.out.println(z);
			x=y;
			y=z;
			z=x+y;
		}
	}
}