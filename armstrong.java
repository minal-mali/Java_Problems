class armstrong
{
	public static void main(String [] args)
	{
		int n = 407; // sum of all digit cube 4cube + 0cube + 7cube = 64 + 0 + 343 = 407
		int rem = 0, sum = 0, ono;
		ono = n;
		System.out.println("Number is:" + n);
		while(n>0)
		{
			rem= n % 10;
			sum += rem*rem*rem;
			n = n/10;
		}
		if(sum==ono)
		System.out.println("Given number is armstrong");
		else
		System.out.println("Given number is not armstrong");
	}
}