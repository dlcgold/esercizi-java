import java.util.Scanner;

public class PrimoMetodi
{
	public static void main(String[]args)
	{
		int a, b, max;
		System.out.println("Inserisci due numeri: ");
		Scanner tastiera=new Scanner(System.in);
		a=tastiera.nextInt();
		b=tastiera.nextInt();
		max=CalcolaMassimo(a,b);
		System.out.println("il massimo è: "+max);
	}

	static int CalcolaMassimo(int a, int b)
	{
		int massimo=0;
		if(a>b)
			massimo=a;
		else
			massimo=b;
		return massimo;
	}

}