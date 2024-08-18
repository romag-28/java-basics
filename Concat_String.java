package MKT;

import java.util.Arrays;

public class Concat_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String Fname="Ram";
     String Lname="Sharma";
     System.out.println(Fname.concat("").concat(Lname));
     String intro="my name is ram";
     String [] a1 = intro.split("");
     String [] a2 = intro.split(" ", 4);
     System.out.println(a1.length);
     System.out.println(Arrays.toString(a1));
     System.out.println(Arrays.toString(a2));
     
     String [] a3 = intro.split("");
     System.out.println(Arrays.toString(a3));
     
     
     
	}

}
