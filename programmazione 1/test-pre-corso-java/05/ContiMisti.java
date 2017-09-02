import java.util.Scanner;

public class ContiMisti
{
	public static void main(String [] args)
	{
		double a, fat, b, c, prod, d, e, pot;
		System.out.print("Inserire il numero di cui calcolare il fattoriale: ");
		Scanner tastiera=new Scanner(System.in);
		a=tastiera.nextDouble();
		fat=fattoriale(a);
		System.out.println("Il fattoriale di "+a+" è: "+fat);

		System.out.print("Inserire ora due numeri di cui effettuare il prodotto: ");
		b=tastiera.nextDouble();
		c=tastiera.nextDouble();
		prod=prodotto (b,c);
		System.out.println("Il prodotto tra "+b+" e "+c+" è: "+prod);

		System.out.print("Inserire ora base e esponente di una potenza: ");
		d=tastiera.nextDouble();
		e=tastiera.nextDouble();
		pot=potenza(d,e);
		System.out.println("Il valore di "+d+" ^ "+e+" è: "+pot);

		System.out.print("Inserire quanti numeri divisibili per 3 e per 5 si vogliono vedere a schermo: ");
		int f=tastiera.nextInt();
		int conta=1, numeri=0, resto, restoc;
		while(numeri<=f)
		{
			if(conta%3==0)
			{
				System.out.println(conta+" che è divisibile per 3");
				conta++;
			}
			else if (conta%5==0) 
			{
				System.out.println(conta+" che è divisibile per 5");
				conta++;
			}
			else if(conta%3!=0)
			{
				numeri--;
				conta++;
			}
			else if(conta%5!=0)
			{
				numeri--;
				conta++;
			}
			numeri ++;	
		
		}
	}



	static double fattoriale(double a)
	{
		if(a>1)
		    return (a*fattoriale(a-1));
		else
			return (1);
	}

	static double prodotto(double b, double c)
	{
		int conta=0;
		double prodparziale=0;
		while(conta<c)
			{
				prodparziale=prodparziale+b;
				conta++;
			}
		return prodparziale;
	}

	static double potenza(double d, double e)
	{
		int conta=0;
		double potparziale=1;
		while(conta<e)
			{
				potparziale=potparziale*d;
				conta++;
			}
		return potparziale;
	}
}
