public class GradingDemo
{
	public static void main(String[] args)
	{
		Grading student1 = new Grading();
		student1.calculateScore();
		student1.letterGrade();
		System.out.println(student1.toString());

	}
}