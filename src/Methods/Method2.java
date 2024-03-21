package Methods;
//method with parameter and with returntype-area of a square//

public class Method2{
	public static void main (String[]args) {
		Method2 n=new Method2();
		n.areaofsquare(5);
		System.out.println(n.areaofsquare(5));
		
		
	}
public double areaofsquare(int a)	
{
	int area;
	area=a*a;
	return area;

	}
}



