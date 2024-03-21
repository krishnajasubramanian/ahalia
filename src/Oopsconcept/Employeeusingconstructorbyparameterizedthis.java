package Oopsconcept;
//passing values to variable using constructor by parameterized with this keyword//
public class Employeeusingconstructorbyparameterizedthis {
	int empid;
	int salary;
	String designation;

public Employeeusingconstructorbyparameterizedthis(int empid,int salary,String designation) {
	this.empid=empid;
	this.salary=salary;
	this.designation=designation;}
	
public static void main(String[] args) {
	Employeeusingconstructorbyparameterizedthis g=new Employeeusingconstructorbyparameterizedthis(10,8000,"accountance");
	System.out.println(g.empid);
	System.out.println(g.salary);
	System.out.println(g.designation);
}

}
