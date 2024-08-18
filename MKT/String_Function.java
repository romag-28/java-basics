package MKT;

public class String_Function {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name ="school name is vidhya";
		name.length();
		System.out.println(name.length());
		System.out.println(name.toUpperCase());
		String batch_name="Ab4vhfFk";
		System.out.println(batch_name.toLowerCase());
		System.out.println(batch_name.charAt(7));
		System.out.println(batch_name.indexOf('m'));
		String student_name="ashwini";
		String student_name1="Mshwini";
		
		System.out.println(student_name.equals(student_name1));
		System.out.println(student_name.equalsIgnoreCase(student_name1));
		System.out.println(student_name.substring(5));
		System.out.println(name.substring(0,6));
		System.out.println(name.substring(7,11));
		System.out.println(name.substring(12,14));
		
		String name="school name is vidya";
		System.out.println(	name.length());
		System.out.println(name.toUpperCase());
	String batch_name="Ab43bymkt";
	System.out.println(	batch_name.toLowerCase());
	System.out.println(	batch_name.charAt(7));
	System.out.println(batch_name.indexOf('m'));
	String a="automation                              batch";
	System.out.println(a.trim());
	String b="       automation batch          ";
	System.out.println(b);
	System.out.println(b.trim());
	String batch_name1="Ab43bymkt";
	System.out.println(batch_name.equals(batch_name1));

	//manish and Manish and MANISH
	System.out.println(batch_name.equals("ab43bymkt"));
	String student_name="ashwini";
	String student_name_1="AshwinI";
	
	System.out.println(student_name.equals(student_name_1));
	System.out.println(student_name.equalsIgnoreCase(student_name_1));
	
	System.out.println(name.contains("manish"));
	System.out.println(name.substring(2));
	System.out.println(name.substring(0, 6));
	}

}
