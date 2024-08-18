package String;

public class String_builder_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuilder s1=new StringBuilder ("School Name");
		s1.append(" Krishna");
		System.out.println(s1);
		//System.out.println(s1.delete (0,7));
		System.out.println(s1.replace(0, 6, "college"));
		System.out.println(s1.substring(10));
		System.out.println(s1.substring(0,9));
	}

}
