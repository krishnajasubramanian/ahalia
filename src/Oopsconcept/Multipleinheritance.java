package Oopsconcept;
//multilevel inheritance//
class Dogb
{
	public void barking()
	{
		System.out.println("Dogb is barking");
	}
}
class Catb extends Dogb
{
	public void sleeping()
	{
		System.out.println("Catb is sleeping");
	}
}
class Lion extends Catb
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}
public class Multipleinheritance 
{
	public static void main(String[]args)
	{
		Lion animal=new Lion();
		animal.barking();
		animal.sleeping();
		animal.running();
	}
	
	

}
