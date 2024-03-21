package Oopsconcept;
//methodoverriding using super keyword---accessing details of parents also//
class Parents
{
	public void phone()
	{
		System.out.println("Nokia");
	}
}
class Child extends Parents
{
	public void phone()
	{
		super.phone();
		System.out.println("IPHONE");
	}
}

public class Methodoverriding 
{
	public static void main(String[]args)
	{
 Child n=new Child();
 n.phone();
 

}}
