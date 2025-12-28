import java.util.*;
enum colors{Red,Blue,Green,Purple,Yellow}

public class EnumMapTest
{
	public static void main(String args[])
	{
		EnumMap<colors,String> map = new EnumMap<colors,String>(colors.class);
		map.put(colors.Red,"1");
		map.put(colors.Blue,"2");
		map.put(colors.Green,"3");		
		System.out.println(map);

	}
}