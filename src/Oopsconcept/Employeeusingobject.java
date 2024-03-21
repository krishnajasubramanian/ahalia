package Oopsconcept;
//passing values in variables using object//
public class Employeeusingobject {
	int empid;
	int salary;
	int deptno;
	String empname;
	
public void dispay()
{
	System.out.println(empid);
	System.out.println(salary);
	System.out.println(deptno);
	System.out.println("empname");
}
public static void main(String[]args)
{
	Employeeusingobject n=new Employeeusingobject();
	n.empid=1;
	n.salary=8000;
	n.deptno=20;
	n.empname="krishnaja";
	n.dispay();
}
	
	
	
}


