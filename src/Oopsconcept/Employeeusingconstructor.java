package Oopsconcept;
//passing values to variables using constructors(default constructor)//
public class Employeeusingconstructor {
	int empid;
	int salary;
	String designation;
public Employeeusingconstructor()
{
	empid=10;
	salary=8000;
	designation="accountance";
}
public static void main(String[]arg) {
	Employeeusingconstructor h=new Employeeusingconstructor();
	System.out.println(h.empid);
	System.out.println(h.salary);
	System.out.println(h.designation);
}
	
}


