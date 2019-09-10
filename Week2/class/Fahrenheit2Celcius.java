import java.util.Scanner;

public class Fahrenheit2Celcius
{
	public static void main(String[] args)
	{
		/* Creating the scanner and variables */
		Scanner scanner = new Scanner(System.in);
		double fTemp, cTemp;

		/* Getting input */
		System.out.print("Input Fahrenheit: ");
		fTemp = scanner.nextDouble();

		/* Convert fahrenheit to celcius and output */
		cTemp = (5.0/9.0) * (fTemp - 32);
		System.out.println(fTemp + " fahrenheit is " + cTemp + " celcius");
	}
}
