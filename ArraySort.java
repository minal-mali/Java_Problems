import java.util.Arrays;
import java.util.Collections;
public class ArraySort
{
	public static void main(String args[])
	{
	int ascen[] = {53,23,12,45,34};
	Integer descen[] = {34,35,64,13,12};
	
	Arrays.sort(ascen);
	Arrays.sort(descen, Collections.reverseOrder());

	System.out.println("Ascending order:" + Arrays.toString(ascen));
	System.out.println("Descending order:" + Arrays.toString(descen));
	}
}