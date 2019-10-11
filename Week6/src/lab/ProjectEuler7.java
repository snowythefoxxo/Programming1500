package lab;

import java.util.Scanner;

public class ProjectEuler7
{
	public static boolean isPrime(int n)
	{
		if (n < 2)
			return false;
		if (n == 2)
			return true;
		if (n % 2 == 0)
			return false;
		
		for (int i = 3; i < (int)Math.sqrt(n) + 1; i++)
		{
			if (n % i == 0)
				return false;
		}
		
		return true;
	}
	
	public static void main(String[] args)
	{
		/* Creating scanner and variables */
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("");
		
		int primeToFind = scanner.nextInt();
		scanner.close();
		
		int counter = 0;
		int n = 1;
		int prime = 2;
		
		/* While the current prime number is less than the desired prime number */
		while (counter < primeToFind)
		{
			n++;
			if (isPrime(n))
			{
				prime = n;
				counter++;
			}
		}
		
		/* Printing out result */
		System.out.printf("Prime #%d is %d", primeToFind, prime);
	}
}
