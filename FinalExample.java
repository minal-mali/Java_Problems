final class FinalConstants 
{
        public static final double Pi = 3.14;
}
class CircleArea 
{
    	double radius;
	CircleArea(double r)
 	{
        	radius = r;
    	}
	void calculateArea()
	{
       		double area = FinalConstants.Pi * radius * radius;
        	System.out.println("Area of Circle = " + area);
    	}
}
public class FinalExample 
{
    	public static void main(String[] args) 
	{
        	CircleArea c1 = new CircleArea(5.0);
       		c1.calculateArea();
    	}
}