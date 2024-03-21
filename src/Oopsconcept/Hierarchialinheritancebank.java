package Oopsconcept;
//hierarchial using bank//
class Bank
{
	public void withdraw()
	{
		System.out.println("withdraw");
	}
    public void deposit()
    {
    	System.out.println("deposit");
    }
}
class sbi extends Bank
{
	public void sbiinterest()
	{
		System.out.println("sbiinterest");
	}
}
class hdfc extends Bank
{
	public void hdfcloan()
	{
		System.out.println("loan");
	}
}
public class Hierarchialinheritancebank
{
	public static void main(String[]args)
	{
		sbi obj=new sbi();
		obj.deposit();
		obj.withdraw();
		obj.sbiinterest();
		hdfc obj1=new hdfc();
		obj1.deposit();
		obj1.withdraw();
		obj1.deposit();
		
	}
}
