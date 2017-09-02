import java.util.Scanner;

public class ContiMisti
{
	public static void main(String [] args)
	{
		double a, fat, b, c, prod, d, e, pot;
		System.out.println("Inserire il numero di cui calcolare il fattoriale: ");
		Scanner tastiera=new Scanner(System.in);
		a=tastiera.nextDouble();
		fat=fattoriale(a);
		System.out.println("Il fattoriale di "+a+" è: "+fat);

		System.out.println("Inserire ora due numeri di cui effettuare il prodotto: ");
		b=tastiera.nextDouble();
		c=tastiera.nextDouble();
		prod=prodotto (b,c);
		System.out.println("Il prodotto tra "+b+" e "+c+" è: "+prod);

		System.out.println("Inserire ora base e esponente di una potenza: ");
		d=tastiera.nextDouble();
		e=tastiera.nextDouble();
		pot=potenza(d,e);
		System.out.println("Il valore di "+d+" ^ "+e+" è: "+pot);

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
