import java.util.Scanner;

public class AssegnazioneVoti
{
public static void main(String [] args)
	{
		int punteggio;
		String voto;
		System.out.println("Inserisci il tuo voto ( intero tra 0 e 10): ");
		Scanner tastiera=new Scanner(System.in);
		punteggio=tastiera.nextInt();
		
		if (punteggio >= 9)
			voto = "Ottimo";
		else if (punteggio >= 8)
			voto = "Distinto";
		else if (punteggio >= 7)
			voto = "Buono";
		else if (punteggio >= 6)
			voto = "Sufficiente";
		else
			voto = "Insufficiente";	
		
		System.out.println("Il punteggio " + punteggio+" corrisponde a "+voto);
	}
}
		
