package Oopsconcept;
//create a class monkey with jump and bite methods,create a class human with speak method which inherits this monkey class and implements basicanimals interface with cat and sleep methods.//
class monkey
{
	public void jump() {
		System.out.println("monkey jump");
	}
	public void bite()
	{
		System.out.println("monkey bite");
	}
}
class human extends monkey implements basicanimal
{
	public void speak()
	{
		System.out.println("human speak");
	}

	@Override
	public void cat() {
		System.out.println("cat is running");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
		
	}
}

interface basicanimal
{
	void cat();
	void sleep();
}

public class Interfaceprogram2 
{
public static void main(String[]args)
{
	human h=new human();
	h.bite();
	h.jump();
	h.speak();
	h.sleep();
	h.cat();

}
}
