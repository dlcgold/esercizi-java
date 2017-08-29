import java.util.Scanner;

public class EsercizioVoti
{
public static void main(String [] args)
	{
		int punteggio;
		String esito;
		String nome;
		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire il nome dello studente:");
		nome=tastiera.next();
		System.out.println("Inserisci il tuo voto ( intero tra 0 e 30): ");
		punteggio=tastiera.nextInt();
		
		
		if(punteggio<18)
		esito="rifare lo scritto";
		else if((punteggio>=18)&&(punteggio<24))
		esito="fare l'orale";
		else if((punteggio>=24)&&(punteggio<=30))
		esito="verbalizzare direttamente il voto";
		else
		esito="eseguire nuovamente il programma";

		System.out.println("Lo studente "+nome+", avendo preso "+punteggio+", deve "+esito);
	}
}
