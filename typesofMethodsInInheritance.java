//Types of methods in Inheritance namely:Inherited,Overridden,Specialised methods.

class Plane 
{
	void takeOff()
	{
		System.out.println("Plane is takeOff");
	}
	void fly()
	{
		System.out.println("Plane is flying");
	}
	void land()
	{
		System.out.println("Plane is landing");
	}
}

class CargoPlane extends Plane
{
	void fly()
	{
		System.out.println("overridden: " +"CargoPlane is" + " flying at low height");
	}
	void carryCargo()
	{
		System.out.println("specialised: "+"CargoPlane is carrying cargo");
	}
}

class PassengerPlane extends Plane
{
	void fly()
	{
		System.out.println("overridden: " +"PassengerPlane is" + " flying at medium height");
	}
	void carryPassenger()
	{
		System.out.println("specialised: "+"PassengerPlane is carrying Passengers");
	}
}

class FighterPlane extends Plane
{
	void fly()
	{ 
		System.out.println("overridden: " +"FighterPlane is" + " flying at greater height");
	}
	void carryWeapons()
	{
		System.out.println("specialised: "+"FighterPlane is carrying Weapons");
	}
}

public class typesofMethodsInInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CargoPlane cp =new CargoPlane();
		PassengerPlane pp =new PassengerPlane();
		FighterPlane fp =new FighterPlane();
		cp.takeOff();
		cp.land();
		cp.fly();
		cp.carryCargo();
		pp.takeOff();
		pp.land();
		pp.fly();
		pp.carryPassenger();
		fp.takeOff();
		fp.land();
		fp.fly();
		fp.carryWeapons();

	}

}
