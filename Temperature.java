import java.util.Scanner;

public class Temperature
{
	private float temperature;
	private String scale;
	private float fahrenheitTemp;
	private float celsiusTemp;

	public void Temperature()
	{	
		temperature = 0;
		scale = "C";
	}

	public void setDegrees(float d)
	{
		temp=d;
	}

	public void setScale()
	{
		scale = "F";
		scale = "C";
	}

	public float setTemperature() 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Farenheit or Celcius: ");
		scale = input.next();
		System.out.println("What is the temperature: ");
		temperature = input.nextFloat();

		if (scale.equals("F"))
		{
			fahrenheitTemp = temperature;

			celsiusTemp = (temperature * 9/5) + 32;
			return fahrenheitTemp;
		}

		else 
		{
			celsiusTemp = temperature;

			fahrenheitTemp = (temperature - 32) * 5/9;
			return celsiusTemp;
		}
	}

	public String toString()
	{
		return ("In Celcius the temperature will be: " + celsiusTemp + "" + "In Farenheit the temperature will be: " + fahrenheitTemp);
	}

}