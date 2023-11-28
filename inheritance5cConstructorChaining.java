class E3test1
{
	int x,y;
	E3test1()
	{	//super()
		x=100;
		y=200;
	}
	E3test1(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class E3test2 extends E3test1
{
	int a,b;
	E3test2()
	{
		this(7,99);
		//a=300;
		//b=400;
	}
	E3test2(int a, int b)
	{	//super()
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

public class inheritance5cConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E3test2 e=new E3test2();
		e.disp();

	}

}
