import java.util.Scanner;
import java.lang.Math;

public class NumberToText
{
	public static void main(String [] args)
	{
		int n;
		System.out.print("Inserire un intero: ");
		Scanner tastiera= new Scanner(System.in);
		n=tastiera.nextInt();
		System.out.println();
		System.out.print("Il numero in lettere è: ");
		
		inWords(n);
		System.out.println();
	}

	public static void inWords(int n)
	{
		if(n<10)
			System.out.print(Word(n)+" ");
		else
		{
			inWords(n/10);
			System.out.print(Word(n%10)+" ");
		}
	}

	public static String Word(int d)
	{
		String result=null;
		switch (d)
		{
			case 0:
			result="Zero";
			break;

			case 1:
			result="Uno";
			break;

			case 2:
			result="Due";
			break;

			case 3:
			result="Tre";
			break;

			case 4:
			result="Quattro";
			break;

			case 5:
			result="Cinque";
			break;

			case 6:
			result="Sei";
			break;

			case 7:
			result="Sette";
			break;

			case 8:
			result="Otto";
			break;

			case 9:
			result="Nove";
			break;

			default:
			System.out.println("Fatal Error");
			System.exit(0);
			break;
		}
		return result;
	}
}