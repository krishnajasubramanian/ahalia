package Oopsconcept;
//methodoverloading ---same name but different arguments//
public class Methodoverloading {
	public void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
public void  add(int a,int b,int c) 
{
	int d=a+b+c;
	System.out.println(d);
	
}
public static void main(String[]args) {
	Methodoverloading h=new Methodoverloading();
	h.add(8, 7);
	h.add(7, 9, 5);
}
}
