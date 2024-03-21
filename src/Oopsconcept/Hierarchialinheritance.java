package Oopsconcept;
class dogbb
{
	public void barking()
	{
		System.out.println("Dog is barking");
		
	}
}
class catbb extends dogbb
{
	public void sleeping()
	{
		System.out.println("Cat is sleeping");
	}
}
class lionbb extends dogbb
{
	public void running()
	{
		System.out.println("Lion is running");
	}
}
public class Hierarchialinheritance
{
	public static void main(String[]args)
	{
		lionbb n=new lionbb();
		
		n.barking();
		n.running();

}}
