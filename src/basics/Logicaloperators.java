package basics;

public class Logicaloperators {
	public static void main (String[] arg){
		String username="abc";
		String password="abcd";
		System.out.println(username=="abc" && password=="abcd");
		System.out.println(username=="abc" || password=="abcd");
		System.out.println(!(username=="abc"));
		boolean x=true;
		boolean y=false;
		System.out.println(x&&y);//true&&false=false
		System.out.println(x||y);
		System.out.println(!x);
		System.out.println(!y);
	}

}
