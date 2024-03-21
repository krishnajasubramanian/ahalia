package Oopsconcept;
//methodoverloading ----by changing the datatypes //

public class Methodoverloading1 {
	public void add(int a,double b)
	{
		double value=a+b;
		System.out.println(value);
	}
public void add(double a,int b) {
	double value=a+b;
	System.out.println(value);
}
public static void main(String[]args) {
 Methodoverloading1 f=new Methodoverloading1();
 f.add(5, 5.5);
 f.add(5.5, 5);
}
}
