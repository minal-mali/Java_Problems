//Shape Area Calculator
//Create an abstract class Shape with abstract method area().
//Create subclasses Circle, Rectangle, and Triangle to implement the method.

abstract class Shape
{
    abstract float area();
}

class Circle extends Shape
{
    float radius;

    Circle(float r) 
    {
        radius = r;
    }

    float area() {
        float pi = 3.14f;
        return pi * radius * radius;
    }
}
class Rectangle extends Shape
{
    int length;
    int breadth;
    Rectangle(int l, int b) 
    {
        length = l;
	breadth = b;
    }

    float area() {
       
        return length * breadth;
    }
}
class Triangle extends Shape
{
	int side;
	Triangle(int s)
	{
		this.side=s;
	}
	float area()
	{
		return side* side *side;
	}
}
public class AreaDemo
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(2.0f);
        System.out.println("Area of Circle: " + c1.area());
	Rectangle r1 = new Rectangle(10,20);
        System.out.println("Area of Rectangle: " + r1.area());
	Triangle t1 = new Triangle(3);
	System.out.println("Area of Triangle:" + t1.area());

    }
}
