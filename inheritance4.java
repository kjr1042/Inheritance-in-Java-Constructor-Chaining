// Let's understand the rules of inheritance
// rule No :4 Cyclic Inheritance is not permitted
class Cdemo2
{
	void disp()
	{
		System.out.println("Cdemo2 class");
	}
}
class Cdemo1 extends Cdemo2
{
	void disp()
	{
		System.out.println("Cdemo1 class");
	}
}
class Cdemo2 extends Cdemo1
{
	void disp()
	{
		
	}
}

public class inheritance4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cdemo2 d =new Cdemo2();
		d.fun1();
		d.fun2();
		d.fun3();


	}

}
