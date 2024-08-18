package MKT;

public class This_Keyword {
	
	int age; //0
	String name; //null
	double salary; //0.0
	void student_details(int age , String name, double salary)//
	{
		this.age=age;
		this.name=name;
		this.salary=salary;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	This_Keyword t1=new This_Keyword();
	t1.student_details(25, "Ram", 87654);
	System.out.println(t1.salary);
	System.out.println(t1.name);
	System.out.println(t1.age);
	
	}

}
