package MKT;

public class Throw_throws {

	public static void main(String[] args) throws NullPointerException , InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
		Thread.sleep(5000);//1sec=1000ms
		System.out.println("Bye");
		throw new NullPointerException ();
		

	}

}
