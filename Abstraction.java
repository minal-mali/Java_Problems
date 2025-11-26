abstract class Animal
{
	abstract void eat();
	void play()
	{
		System.out.println("Animals are playing");
	}
}
class Dog extends Animal
{
	void eat()
	{
		System.out.println("Dog are eating");
	}
}
class Abstraction
{
	public static void main (String args[])
	{
		Animal a = new Dog();
		a.eat();
		a.play();
	}
}