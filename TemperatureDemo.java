public class TemperatureDemo
{
	public static void main(String[] args)
	{
		Temperature temp1 = new Temperature();
		temp1.setTemperature();

		System.out.println(temp1.toString());

		Temperature temp2 = new Temperature();
		temp2.setTemperature();
		temp2.setDegrees();
		temp2.setScale();

		System.out.println(temp1.toString());
	}
}