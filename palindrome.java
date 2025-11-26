class palindrome
{
	public static void main(String [] args)
	{
		int n = 421;
		int rem = 0 , rev = 0, ono;
		ono = n;
		while(n>0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n/10;

		}
		System.out.println("Reverese Number is:" + rev);
		if(rev==ono)
		System.out.println("Given number is palindrome");
		else
		System.out.println("Given number is not palindrome");
	}

}