import java.util.*;
enum colors{Red,Blue,Green,Purple,Yellow}
enum days{Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday}
enum city{Pune,Mumbai,Nashik,Delhi,Kolkata}
public class EnumSetTest
{
	public static void main(String args[])
	{
		Set<colors> s1 = EnumSet.allOf(colors.class);
		System.out.println("Name of colors:" +s1);

		Set<days> s2 = EnumSet.of(days.Monday,days.Thursday,days.Saturday);
		System.out.println("Name of days:" +s2);

		Set<colors> s3 = EnumSet.noneOf(colors.class);
		System.out.println("Name of colors:" +s3);

		List<city> l1 = List.of(city.Pune,city.Mumbai);
		Set<city> s4 = EnumSet.copyOf(l1);
		System.out.println("Elements of s4:" +s4);

	}
}