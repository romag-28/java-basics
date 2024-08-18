package MKT;

import java.util.Arrays;

import java.util.Arrays;

public class CountAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count_of_alpha = 0;
		int count_of_numeric = 0;
		int count_of_space = 0;
		String input = "17 October 2024 ^%$#";
		char c1[] = input.toCharArray();
		System.out.println(Arrays.toString(c1));
		for (int i = 0; i < input.length(); i++) {
			boolean b1 = Character.isAlphabetic(c1[i]);
			boolean b2 = Character.isDigit(c1[i]);
			boolean b3 = Character.isWhitespace(c1[i]);
			if (b1 == true) {
				count_of_alpha++;
			}

			if (b2 == true) {
				count_of_numeric++;
			}
			if (b3 == true) {
				count_of_space++;
			}
		}

		System.out.println("Alphabets-> " + count_of_alpha);
		System.out.println("numeric -> " + count_of_numeric);
		System.out.println("Spaces -> " + count_of_space);
		int count_of_specialcharacter = input.length() - (count_of_alpha + count_of_numeric + count_of_space);
		// BODMAS
		System.out.println("Total number of special charcters are -> " + count_of_specialcharacter);

	}

}

/*
 * class-50 Indian-35 USA-5 UK-5 Other ?
 * 
 * 
 * 
 */