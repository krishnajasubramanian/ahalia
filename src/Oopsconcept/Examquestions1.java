package Oopsconcept;
//create a class student it contains two method mark and show details,class teacher with department method have to extend student class and implement interface principle with resign and rejoin methods//
class Student
{
	public void mark()
	{
	    System.out.println("Student mark");
	}
	public void showdetails()
	{
		System.out.println("show details of student");
	}
}
class Teacher extends Student implements resignrejoin
{
	public void department()
	{
		System.out.println("department of student");
	}

	@Override
	public void resign() {
	   System.out.println("resigned");
		
	}

	@Override
	public void rejoin() {
		System.out.println("rejoined");
		
	}
}
interface resignrejoin
{
	void resign();
	void rejoin();
}
public class Examquestions1 {
	public static void main(String[]args)
	{
		Teacher t=new Teacher();
		t.department();
		t.rejoin();
		t.resign();
		Student s=new Student();
		s.mark();
		s.showdetails();
		
	}

}
