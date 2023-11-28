class E1test1
{
	int x,y;
	E1test1()
	{	//super()
		x=100;
		y=200;
	}
	E1test1(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
}
class E1test2 extends E1test1
{
	int a,b;
	E1test2()
	{
		
		a=300;
		b=400;
	}
	E1test2(int a, int b)
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

public class inheritance5aConstructorChaining {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		E1test2 e=new E1test2(9,99);
		e.disp();

	}

}
