//Class Animal → method: sound()
//Class Dog overrides sound() but also calls parent sound using super.sound().

class Animal
{
	void sound()
	{
		System.out.println("Animals sound are loud");
	}
}
class Dog extends Animal
{
	void sound()
	{
		super.sound();
		System.out.println("Dog Barks");
	}
}
public class SuperDemoT
{
	public static void main(String args[])
	{
		Dog d1 = new Dog();
		d1.sound();
	}
}
