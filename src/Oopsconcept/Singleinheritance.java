package Oopsconcept;
//single inheritance//

class Dog 
{
	public void barking()
	{
		System.out.println("dog is barking");
	}
}
class Cat extends Dog
{
	public void sleeping() 
	{
		System.out.println("cat is sleeping ");
	}
}
public class Singleinheritance
{
public static void main(String[]args) {
	Cat animal=new Cat();
	animal.barking();
	animal.sleeping();
	
	
		}
}
	

