class reverse
{
	public static void main(String args[])
	{
		int n , rev = 0 , rem = 0;
		n=345;
		while(n>0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;
		}
		System.out.println("Reverse number is " + rev);
	}
}