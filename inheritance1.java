// Let's understand the rules of inheritance
// rule No:1 Private members do not participate in inheritance
class Account1
{
	private long acNum=4567889L;
	private int pin=6789;
}
class Hacker1 extends Account1
{
	void disp() 
	{
		System.out.println(acNum);
		System.out.println(pin);
	}
	void change()
	{
		acNum=67696768L;
		pin=123;
	}
}

public class inheritance1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hacker1 h=new Hacker1();
		h.disp();

	}

}
