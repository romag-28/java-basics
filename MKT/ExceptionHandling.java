package MKT;

public class ExceptionHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {
		System.out.println("hello");
		int c=1/0;
		System.out.println(c);
		}
		catch (ArithmeticException a)
		{
          System.out.println("I have handled");
	}

}
}