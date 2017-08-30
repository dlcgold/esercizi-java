import java.util.Scanner;

public class PrimoWhile
{
public static void main(String [] args)
	{
	  int conteggio, numero;
	  System.out.println("Inserisci un numero:");
	  Scanner tastiera=new Scanner(System.in);
	  numero= tastiera.nextInt();
	  conteggio=1;

	  while(conteggio<=numero)
	  	{
	  		System.out.print(conteggio +", ");
	   	    conteggio ++;
	  	}

	  System.out.println();
	  System.out.println("Sorpresa!");
	}
}
