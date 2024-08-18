package String;
class Parent_Class
{
	
	private int age=18;
   public void setAge(int age)
	{
		
		this.age=age;
	}
	
	public int getAge()
	{
	  return age;
	
	}
	
} 

public class Return_Class {

	
	public static void main (String[] args)
	{
		Parent_Class p1 = new Parent_Class ();
		p1.setAge(45);
		System.out.println(p1.getAge());
		
		
		
	}
	
}
