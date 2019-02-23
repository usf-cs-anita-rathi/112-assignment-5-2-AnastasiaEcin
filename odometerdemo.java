import java.util.Scanner;

public class Odometerdemo
{
	public static void main(String[] args)
	{

		Odometer trip1 = new Odometer();
		trip1.Odometer(20 , 10);
		trip1.setFuel(15);
		trip1.addMiles(5);
		System.out.println("Number of gallons of gasonline used: " + trip1.getnumberOfGallons());

		Odometer trip2 = new Odometer();
		trip2.Odometer(345 , 10);
		trip2.setFuel(15);
		trip2.addMiles(10);
		System.out.println("Number of gallons of gasonline used: " + trip2.getnumberOfGallons());

		Odometer trip3 = new Odometer();
		trip3.Odometer(132344 , 40);
		trip3.setFuel(15);
		trip3.addMiles(10);
		System.out.println("Number of gallons of gasonline used: " + trip3.getnumberOfGallons());
		

	}
}