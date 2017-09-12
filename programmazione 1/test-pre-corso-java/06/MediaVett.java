import java.util.Scanner;
import java.lang.Math;

public class MediaVett
{
	public static void main(String [] args)
	{
		int n;
		double media, sigma;
		System.out.print("Inserire la lunghezza del vettore: ");
		Scanner tastiera= new Scanner(System.in);
		n=tastiera.nextInt();
		double [] vettore= new double[n];
		for(int i=0;i<n;i++)
			vettore[i]=tastiera.nextDouble();
		System.out.println();
		media=Media(vettore,n);
		sigma=Sigma(vettore,n,media);

		System.out.print("La media dei valori è: "+media);
		System.out.println();
		System.out.print("La sigma dei valori è: "+sigma );
		System.out.println();
	}

	public static double Media (double [] v, int n)
	{
		double somma=0;
		for(int i=0;i<n;i++)
			somma=somma+v[i];
		double med=somma/n;
		return med;
	}

	public static double Sigma (double [] v, int n, double med)
	{
		double somma=0;
		for(int i=0;i<n;i++)
			somma=somma+Math.pow(v[i]-med,2.0);
		double sig=Math.pow(somma/(n-1),0.5);
		return sig;
	}	
}