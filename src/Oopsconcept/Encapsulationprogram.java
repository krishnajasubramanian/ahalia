package Oopsconcept;
//encapsulation program//
class Encap
{
	private String name;
	private String designation;
	public String getName()
	{
		return name;
	}
	public void setName(String name) 
	{
		this.name=name;
	}
	public String getDesignation()
	{
		return designation;
	}
	public void setDesignation (String designation) 
	{
		this.designation=designation;
	}
	
}

public class Encapsulationprogram
{
public static void main(String[]args) {
	Encap ob=new Encap();
	ob.setName("krishnaja");
	System.out.println(ob.getName());
	ob.setDesignation("tester");
	System.out.println(ob.getDesignation());
}
}
