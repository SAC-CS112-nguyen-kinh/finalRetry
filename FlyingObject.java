package faiL;

public class FlyingObject {
	
	private String _name;
	private int _mph;
	private int _fpm;
	private int calculateAltitude(int minutes) {return _fpm * minutes;}
	float calculateDistance(int minutes) {return (_mph * (minutes/60));}
	
	
	public FlyingObject(String strName) 
	{
		_name = strName;
	}

	public void SetAirSpeed(int airSpeedMPH) 
	{
		_mph = airSpeedMPH;
	}

	public void SetAltimeter(int elevationPerMinute) 
	{
		_fpm = elevationPerMinute;
	}

	public void Fly(int interval, int howLongInMinutes) 
	{
		System.out.println( _name + " is flying for " + howLongInMinutes + ".");
		
		for (int i = interval; i <= howLongInMinutes; i = i + interval) 
		{
			System.out.println( "  -> after " + i + "minutes, " + _name + " is at " + calculateAltitude(howLongInMinutes) 
				 + "ft and traveled " + calculateDistance(howLongInMinutes) + " miles.");
		}
	
	}
}
