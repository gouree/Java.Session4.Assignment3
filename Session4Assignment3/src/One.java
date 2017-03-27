/*Assume that class A extends class B, 
 * which extends class C. 
 * Also all the three classes implement
the method test().
How can a method in a class A invoke the test() method defined in class C
(without creating a new instance of class C).
*/
public class One {
	
	public static void main(String args[])
	{
	C c = new C();
	B b = new B();
	A a= new A();
	
	a.hello();
	}
}

class C
{
	public void test()
	{
		System.out.println("C");
	}
}

class B extends C
{
	public void test()
	{
		System.out.println("B");
	}
	
}
class A extends B
{
	public void test()
	{
		System.out.println("A");
	}
	
	public void hello()
	{
		test();
	}
}