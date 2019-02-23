import java.util.Scanner;

public class Odometer
{
	private float miles;
	private float fuelEfficiency;

	public void Odometer(double milesStart, float fuelStart)
	{
		miles = milesStart;
		fuelEfficiency = fuelStart;
	}

	public void setMiles()
	{	
		miles = 0;
	}

	public void setFuel(float newtotal)
	{	
		fuelEfficiency = newtotal;
	}

	public void addMiles(float newtotal)
	{
		miles += newtotal;
	}

	public float getnumberOfGallons()
	{
		return (miles / fuelEfficiency); 
	}

}
