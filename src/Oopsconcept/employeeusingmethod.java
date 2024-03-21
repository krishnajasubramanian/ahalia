package Oopsconcept;
//passing values to variable using methods//

public class employeeusingmethod 
	{
		int empid;
		int salary;
		String designation;

	public void setvalues(int id,int sal,String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
	}
	public void display()
	{
		System.out.println("empid="+ empid);
		System.out.println("salary="+ salary);
		System.out.println("desig="+designation);
	}
	public static void main(String[]arg) {
		employeeusingmethod n=new employeeusingmethod();
		n.setvalues(30,80000,"designer");
		n.display();
		
		
		

	
			

	}

}
