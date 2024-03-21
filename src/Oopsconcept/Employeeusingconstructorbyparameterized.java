package Oopsconcept;
//passing values to variable using constructors(parameterized constructor)//

public class Employeeusingconstructorbyparameterized {
	int empid;
	int salary;
	String designation;
public Employeeusingconstructorbyparameterized(int id,int sal,String desig) {
	empid=id;
	salary=sal;
	designation=desig;
}
public static void main(String[]arg) {
	Employeeusingconstructorbyparameterized n=new Employeeusingconstructorbyparameterized(10,80000,"accountance");
	System.out.println(n.empid);
	System.out.println(n.salary);
	System.out.println(n.designation);

    
}


}
