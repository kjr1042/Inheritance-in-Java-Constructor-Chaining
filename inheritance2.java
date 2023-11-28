// Let's understand the rules of inheritance
// rule No:2 Multilevel Inheritance is permitted in Java
class demo1
{
	void fun1()
	{
		System.out.println("Inside Parent class");
	}
}
class demo2 extends demo1
{
	void fun2()
	{
		System.out.println("Inside child class");
	}
}
class demo3 extends demo2
{
	void fun3()
	{
		System.out.println("inside demo3 class");
	}
}
public class inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo3 d =new demo3();
		d.fun1();
		d.fun2();
		d.fun3();

	}

}
