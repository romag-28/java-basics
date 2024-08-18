package Type_Casting;
import java.util.HashMap;
import java.util.map;


import java.util.Map;

public class Map_Interface2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> m3 = new HashMap <String , String> ();
		m3.put("Megha" , "Performance Mar");
		m3.put("Aishwarya", "SEO Expert");
		m3.put ("Kar" , "Student");
		System.out.println(m3);
		
		Map<String, Double> m1 = new HashMap <String , Double> ();
		m1.put("Megha" , 51.90);
		m1.put("Aishwarya", 49.98);
		m1.put ("Kar" , 32.86);
		System.out.println(m1);
		
		Map<String, Integer> m11 = new HashMap <String , Integer> ();
		m11.put("Megha" , 51);
		m11.put("Aishwarya", 49);
		m11.put ("Kar" , 32);
		System.out.println(m11);
		m11.putIfAbsent("Sree", 32);
		System.out.println(m11);
		System.out.println(m11.containsKey(m11));
		

	}

}
