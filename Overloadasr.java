class Overloadasr {

    	double area(double radius) 
	{
       		return 3.14159 * radius * radius;
   	}

    	int area(int side)
	{
        	return side * side;
	}
        int area(int length, int breadth)
        {
       		return length * breadth;
        }
	public static void main(String[] args)
	{
        	Overloadasr a1 = new Overloadasr();
		System.out.println("Area of Circle: " + a1.area(5));      
        	System.out.println("Area of Square: " + a1.area(4));       
        	System.out.println("Area of Rectangle: " + a1.area(5,3));  
 	}
}
