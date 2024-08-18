package String;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s ="Roma";
		String output="";
		
		for (int i=s.length()-1 ; i>=0 ; i--)
		{
		
		  output=output+s.charAt(i);
		  
		}
		System.out.println(output);
	}

}
