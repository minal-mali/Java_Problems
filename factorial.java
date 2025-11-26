class factorial
{
	public static void main (String args[])
{
	int n = 5;
	int fact = 1;
	int i;
	for(i=1 ; i<=n; i++)
	{
		fact = fact*i;
	}
	System.out.print("Factorial is:" + fact);
}
}

