import java.util.Scanner;

public class Bubblesort
{
	public static void main(String [] args)
	{
		System.out.print("Inserire la lunghezza del vettore: ");
		int n;
		Scanner tastiera= new Scanner(System.in);
		n=tastiera.nextInt();
		double [] vettore=new double[n];
		for(int i=0;i<n;i++)
			vettore[i]=tastiera.nextDouble();
		System.out.println();
		System.out.println("Ecco il vettore inserito: ");
		for(int i=0;i<n;i++)
			System.out.print(vettore[i]+ " ");
		System.out.println();
		System.out.println();

		Bubble(vettore,n);
		System.out.println("Ecco il vettore inserito riordinato: ");
		for(int i=0;i<n;i++)
			System.out.print(vettore[i]+ " ");
		System.out.println();
		System.out.println();
	}

	public static void Bubble(double [] v, int n)
	{
		for(int i = 0; i<n-1; i++)
		{
			if (v[i] > v[i+1])
			{
				Scambia(v, i);
				for(int k = i; k>0 && v[k]<v[k-1];k--)
				{
					Scambia(v, k-1);
				}
			}
		}
	}

	public static void Scambia(double [] v, int i)
	{
		double a;
		a=v[i];
		v[i]=v[i+1];
		v[i+1]=a;
	}
}	
