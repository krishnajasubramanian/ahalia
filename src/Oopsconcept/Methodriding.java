package Oopsconcept;
//method overriding without super keyword----only child class detail is access --parent class details is hidden//
class A
{
	public void add()
	{
		int a=10;
		System.out.println(a);
	}
}

class B extends A
{
	public void add()
	{
		int a=20;
		System.out.println(a);
	}
}
public class Methodriding
{
  public static void main(String[]args)
  {
	  B obj=new B();
	  obj.add();
	  
  }
}
