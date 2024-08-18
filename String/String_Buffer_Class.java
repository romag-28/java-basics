package String;


public class String_Buffer_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
	String s6=new String ("Ashwini");
		s6.concat("Kale");
		System.out.println(s6);
		System.out.println(s6.indexOf('w'));
		System.out.println(s6.indexOf('A'));
		
		
		
		StringBuffer s1 = new StringBuffer ("Ashwini");
           s1.append(" Kale");
           System.out.println(s1.length());
           System.out.println(s1.substring(1));
           System.out.println(s1.substring(2,5));
           System.out.println(s1.substring(2,5));
           
           System.out.println(s1.indexOf("A"));
           System.out.println(s1);
           
           System.out.println(s1.isEmpty());
           System.out.println(s1.replace(0,7,"Mahesh"));
           
           StringBuffer s2=new StringBuffer ("monika nair");
           System.out.println(s2.delete(0,7));
           
           StringBuffer s3 = new StringBuffer ("Gobind");
           System.out.println(s3.reverse());
           
           
           
	}

}
