// Let's understand the rules of inheritance
// rule No :5 Constructors do not participate in inheritance

class Ctest1
{
	int x,y;
	Ctest1()
	{	//super()
		x=100;
		y=200;
	}
	Ctest1(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class Ctest2 extends Ctest1
{
	int a,b;
	Ctest2()
	{
		//super()
		a=300;
		b=400;
	}
	Ctest2(int a, int b)
	{
		this.a=a;
		this.b=b;
	}
	void disp()
	{
		System.out.println("x= "+x);
		System.out.println("y= " +y);
		System.out.println("a= "+a);
		System.out.println("b= "+b);
	}
	
}


public class inheritance5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ctest2 c=new  Ctest2();
		c.disp();

	}

}
