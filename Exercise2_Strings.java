package MKT;

public class Exercise2_Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	String a = "manish kumar";
	System.out.println(a.isEmpty());
	System.out.println(a.lastIndexOf('a'));
	String new1 = a.replace('m' , 'a');
	System.out.println(new1);
	String new2 = a.replaceAll(" " , "");
	System.out.println(new2);
	String new3 = a.replace("kumar" , "tiwari");
	System.out.println(new3);
	
	String b = "school123";
	
	System.out.println(b.replaceAll("[0-9]", ""));
	System.out.println(b.replaceAll("[a-z]" , ""));
	
	String c = "Manish123 School";
	
	System.out.println(c.replaceAll("[A-Z]", ""));
	
	String a1 = "manish kumar tiwari";
	System.out.println(a1.matches("(.*)k"));
	System.out.println(a1.matches("(.*)i"));
	System.out.println(a1.matches("m(.*)"));
	System.out.println(a1.matches("(.*)z(.*)"));
	
	String a3 ="tom";
	System.out.println(a3.matches("..."));
	
	
	
	
	}

}
