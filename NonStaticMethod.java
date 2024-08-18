package MKT;

public class NonStaticMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers {3, 7 ,2, 9

	}

}
class A
{
    void method()
    {
    }
}
class Demo
{
    static void method2()
    {
        A a=new A();
        a.method();
    }
    
    void method3()
    {
        A a=new A();
        a.method();
    }
    
    public static void main(String args[])
    {
        A a=new A();
        a.method();
        method2();
        }

}