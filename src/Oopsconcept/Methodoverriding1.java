package Oopsconcept;
//methodoverriding using super keyword by annotation//
class Car
{
	public void speed()
	{
		System.out.println("car speed");
	}
	public void brake()
	{
		System.out.println("car brake");
	}
}
class BMW extends Car
{

	@Override
	public void speed() {
		System.out.println("Bmw speed");
		super.speed();
	}

	@Override
	public void brake() {
		System.out.println("Bmw brake");
		super.brake();
	}
	
}

public class Methodoverriding1
{
	public static void main(String[]args) {
  BMW k=new BMW();
  k.speed();
  k.brake();
  
}}
