package Oopsconcept; 
//Create a class named members having the following details.
//1.name 2.age 3.address 4.salary//
//it also has a method printdetails which print all the details of members.//
//classes Worker and manager inherits the member class.the worker and manager classes have data members specialization and department respectively//
//Assign vlues to worker and manager by making an object of both these classes and print the details.//
class members
{
	String name;
	int age;
	String address;
	int salary;
public void printdetails()
{
 System.out.println("name="+name);
 System.out.println("age="+age);
 System.out.println("address="+address);
 System.out.println("salary="+salary);
}
}
class Worker extends members{
	String specialization;
	}
class manager extends Worker{
	String department;
}
public class Classwrk
{
    public static void main(String[]args)
    {
	 Worker e1=new Worker();
	 e1.name="anu";
	 e1.age=12;
	 e1.salary=8000;
	 e1.address="coimbatre";
	 e1.specialization="selenium";
	 e1.printdetails();
	 System.out.println("specialization="+e1.specialization);
	 
	 manager e2=new manager();
	 e2.name="krishnaja";
	 e2.age=13;
	 e2.address="tamilnadu";
	 e2.salary=5000;
	 e2.department="accountance";
	 e2.printdetails();
	 System.out.println("department="+e2.department);

	 
	
}
    }

	

	


