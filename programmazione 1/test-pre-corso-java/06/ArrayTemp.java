import java.util.Scanner;

public class ArrayTemp
{
	public static void main(String [] args)
	{
		System.out.println("Inserire il numero di temperature su cui fare i conti: ");
		int n;
		Scanner tastiera= new Scanner(System.in);
		n=tastiera.nextInt();
		double [] temperature= new double[n];
		double somma=0;
		System.out.println("Inserire "+n+" temperature");

			for(int i=0;i<n;i++)
			{
				temperature[i]=tastiera.nextDouble();
				somma=somma+temperature[i];
			}

		System.out.println();
		double media=somma/n;
		System.out.println("La temperatura media è: "+media);
		System.out.println();
		System.out.println("In particolare, per ogni temperatura si ha che: ");

			for(int i=0;i<n;i++)
			{
				if(temperature[i]<media)
					System.out.println(temperature[i]+" è sotto la media");
				else if(temperature[i]>media)
					System.out.println(temperature[i]+" è sopra la media");
				else 
					System.out.println(temperature[i]+" è pari alla media");
			}
	}
}