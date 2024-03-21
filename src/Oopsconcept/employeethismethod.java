package Oopsconcept;
//passing values to variables by using methods with this //

public class employeethismethod {
	int empid;
	int salary;
	String designation;
public void setvalues(int empid,int salary,String designation)
{
	this.empid=empid;
	this.salary=salary;
	this.designation=designation;}
public void display() {
	System.out.println("empid="+empid);
	System.out.println("salary="+salary);
	System.out.println("designation="+designation);
	}

public static void main(String[]arg) 
{
	employeethismethod n=new employeethismethod();
	n.setvalues(10, 8000,"housekeeper");
	n.display();
	

	
	
}

}
