package controlstatements;

public class Switch {
	public static void main(String[] arg) {
		int a=10;
		switch(a)
		{
		case 1:
			System.out.println("sunday");
			break;
		case 2:
			System.out.println("monday");
			break;
		case 3:
			System.out.println("wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("saturday");
			break;
		default:
			System.out.println("invalid day");
		}
	
		
	}

}
