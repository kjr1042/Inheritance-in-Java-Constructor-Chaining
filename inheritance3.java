
// Let's understand the rules of inheritance
// rule No:3 Multiple Inheritance is not permitted in java as it leads to diamond shaped problems which results in ambiguity. 
class Mdemo1 extends Object
{
	void fun1()
	{
		System.out.println("Inside child class-1");
	}
}
class Mdemo2 extends Object
{
	void fun2()
	{
		System.out.println("Inside child class-2");
	}
}
class Mdemo3 extends Mdemo1,Mdemo2
{
	void fun3()
	{
		System.out.println("Inside child class-3");
	}
}


public class inheritance3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mdemo3 d =new Mdemo3();
		d.fun1();
		d.fun2();
		d.fun3();

	}

}
