package Type_Casting;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map m1 = new HashMap();
		m1.put("Ram", 51);
		m1.put("Supriys", 32);
		m1.put("Mahesh", 28);
		m1.put("Sumar", 33);
		
		System.out.println(m1);
		
		Map m2 = new HashMap();
		m2.put("A", 51);
		m2.put("BO", 32);
		m2.put("Si", 28);
		m2.put("Sa", 33);		
		m2.putAll(m1);
		System.out.println(m2);
		
		Map m3 = new HashMap();
		m3.put("A", 51);
		m3.put("BO", 32);
		m3.put("Si", 28);
		m3.put("Sa", 33);
		
		System.out.println(m3);
		
		
		
		
		

	}

}

