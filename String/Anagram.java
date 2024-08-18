package String;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Roma";
		String s2 = "Race ";
		
	    char [] array1 = s1.toCharArray();
	    char [] array2 = s2.toCharArray();
	    Arrays.sort(array1);
	    Arrays.sort(array2);
	    
	    if(Arrays.equals(array1, array2) == true) 
	    {
	    	System.out.println("Number is Anagram");
	    	    			    	
	    } else {
	    		
	    		System.out.println("Number is not Anagra");
	    }
	    
	}
	    
	
	

	}


