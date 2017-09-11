import java.util.Scanner;

public class MatrixFirst
{
	public static void main(String [] args)
	{
		int r,c;
		System.out.println("Inserire il numero di righe: ");
		Scanner tastiera= new Scanner(System.in);
		r=tastiera.nextInt();
		//System.out.println("Inserire il numero di colonne: ");
		c=6;

		int [][] matrice=new int[r][c];

		for(int i=0;i<r;i++)
			for(int o=0;o<c;o++)
				matrice[i][o]=Bilancio(1000.00, i+1, (5+0.5*o));

		System.out.println("Bilanci tassi d'interesse annuali, arrotondamento a valori interi di euro");
		System.out.println();
		System.out.println("Anni    5.00% 5.50% 6.00% 6.50% 7.00% 7.50%");

		for(int i=0;i<r;i++)
		{
			System.out.print((i+1)+"	");
			for(int o=0;o<c;o++)
				System.out.print("$"+matrice[i][o]+" ");
			System.out.println();
		}
	}

	public static int Bilancio (double bilancioInizale, int anni, double tasso)
	{
		double bilancioCorrente=bilancioInizale;
		for(int a=0;a<=anni;a++)
			bilancioCorrente=bilancioCorrente*(1+tasso/100);
		return (int) (Math.round(bilancioCorrente));
	}
}