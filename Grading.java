import java.util.Scanner;

public class Grading
{
	private double quiz1, quiz2, quiz3;
	private double midterm;
	private double exam;
	private double numericGrade = 0;
	private String letterGrade;

	public void studentRecord()
	{
		quiz1 = 0;	
		quiz2 = 0;
		quiz3 = 0;
		midterm = 0;
		exam = 0;
	}

	public double calculateScore()
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter in your grade for Quiz 1: ");
		quiz1 = input.nextDouble();

		System.out.println("Enter in your grade for Quiz 2: ");
		quiz2 = input.nextDouble();

		System.out.println("Enter in your grade for Quiz 3: ");
		quiz3 = input.nextDouble();

		System.out.println("Enter in your grade for the Midterm: ");
		midterm = input.nextDouble();

		System.out.println("Enter in your grade for the Exam: ");
		exam = input.nextDouble();

		double quiztotal = ((quiz1 + quiz2+ quiz3)*10/12);
		double midtermtotal = (midterm * 0.35);
		double examtotal = (exam * 0.40);
		numericGrade = numericGrade + (quiztotal + midtermtotal + examtotal);

		return numericGrade;
	}

	public String letterGrade()
	{
		if (numericGrade >= 90)
			letterGrade = "A";
		else if (numericGrade >= 80)
			letterGrade = "B";
		else if (numericGrade >= 70)
			letterGrade = "C";
		else if (numericGrade >= 60)
			letterGrade = "D";
		else 
			letterGrade = "F";

		return letterGrade;
	}

	public String toString()
	{ 
		return("Student Record: \nQuiz 1: " + quiz1 + "\nQuiz 2: " + quiz2 + "\nQuiz3: " + quiz3 + "\nMidter: " + midterm + "\nExam: " + exam + "\nNumeric Grade: " + numericGrade + "\nLetter Grade: " + letterGrade);
	}
}

