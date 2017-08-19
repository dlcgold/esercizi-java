import java.util.Scanner;
public class Cestini
{
	public static void main(String[] args)
	{
		int cestini, uovaxcestino, uovatot;
		Scanner tastiera = new Scanner (System.in);
		System.out.println("Inserisci il numero di cestini");
		cestini=tastiera.nextInt();
		System.out.println("Inserisci il numero di uova per cestino");
		uovaxcestino=tastiera.nextInt();
		uovatot=cestini*uovaxcestino;

			System.out.println("Se hai " + uovaxcestino + " uova per cestino e " + cestini + " cestini allora hai " + uovatot + " uova in totale");

			System.out.println("Rimuoviamo ora delle uova da ciascun cestino");
	int uovainmeno;
		 System.out.println("Quante uova vuoi rimuovere?");
			
		uovainmeno=tastiera.nextInt();
		uovaxcestino=uovaxcestino-uovainmeno;
		uovatot=cestini*uovaxcestino;

		System.out.println("Ora hai " +uovaxcestino+" uova nel cestino e quindi " + uovatot + " uova in totale");
				
	}
}
			
