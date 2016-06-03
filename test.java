package faiL;

public class test 
{

	public static void main(String[] args)
	{
			int displayInterval = 5;
			int flyingTime = 30;
			
			FlyingObject bird = new FlyingObject("Bird");
			bird.SetAirSpeed(10);
			bird.SetAltimeter(3);
			bird.Fly(displayInterval, flyingTime);
			
			FlyingObject airplane = new FlyingObject("Airplane");
			airplane.SetAirSpeed(450);
			airplane.SetAltimeter(50);
			airplane.Fly(displayInterval, flyingTime);
			
			FlyingObject jetPlane = new FlyingObject("JetPlane");
			jetPlane.SetAirSpeed(100);
			jetPlane.SetAltimeter(120);
			jetPlane.Fly(displayInterval, flyingTime);
			
			FlyingObject missile = new FlyingObject("Missile");
			missile.SetAirSpeed(2500);
			missile.SetAltimeter(800);
			missile.Fly(displayInterval, flyingTime);
			
			FlyingObject superman = new FlyingObject("Superman");
			superman.SetAirSpeed(3500);
			superman.SetAltimeter(500);
			superman.Fly(displayInterval, flyingTime);
			
	}
}
