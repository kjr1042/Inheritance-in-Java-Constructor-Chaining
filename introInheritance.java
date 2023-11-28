class Account
{
	long acNum=34458432L;
	int pin=1942;
}
class Hacker extends Account
{
	void disp()
	{
		System.out.println(acNum);
		System.out.println(pin);
	}
	void change()
	{
		 acNum=9854627L;
		 pin=4321;
	}
}
public class introInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hacker h=new Hacker();
		h.disp();
		h.change();
		h.disp();
		

	}

}
