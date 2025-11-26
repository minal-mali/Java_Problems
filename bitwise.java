class bitwise{

	public static void main(String [] args)
{
	int no1 = 50;
	int no2= 10;
	System.out.println("Bitwise no1&no2:" + (no1&no2));
	System.out.println("Bitwise no1|no2:" + (no1|no2));
	System.out.println("Bitwise no1^no2:" + (no1^no2));
	System.out.println("Bitwise ~no1:" + (~no1));

	System.out.println("Leftshift:" + (no1<<1));

	System.out.println("Rightshift:" + (no1>>1));
	System.out.println("Rightshift:" + (no1>>2));


}
}