class Animal
{
	void eat()
	{
		System.out.println("Animal are eating");
	}
}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog are barking");
	}
}
class Puppy extends Dog
{
	void play()
	{
		System.out.println("Puppy are playing");
	}
}
class Main
{
	public static void main(String args[])
	{
	Puppy p1 = new Puppy();
	p1.bark();
	p1.eat();
	}
}