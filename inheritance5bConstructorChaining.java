class E2test1
{
	int x,y;
	E2test1()
	{	//super()
		x=100;
		y=200;
	}
	E2test1(int x, int y)
	{	//super()
		this.x=x;
		this.y=y;
	}
}
class E2test2 extends E2test1
{
	int a,b;
	E2test2()
	{
		
		a=300;
		b=400;
	}
	E2test2(int a, int b)
	{	super(a,b);
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

public class inheritance5bConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E2test2 e=new E2test2(9,99);
		e.disp();

	}

}
