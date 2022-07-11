package exercise_03;

public class BeispielDo
{
	public static void main(String[] args)
	{
		var zahl = 0;

		do
		{
			System.out.println(zahl);
			zahl++;
		} while (zahl < 101);
	}
}