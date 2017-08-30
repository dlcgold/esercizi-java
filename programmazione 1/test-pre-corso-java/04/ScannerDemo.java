import java.util.Scanner;

public class ScannerDemo
{
public static void main(String [] args)
	{
		Scanner tastiera=new Scanner(System.in);
		System.out.println ("Digita due interi separati da uno spazio");
		int a, b;
		a=tastiera.nextInt();
		b=tastiera.nextInt();
		System.out.println("Hai stampato " +a+" e "+b);
		
		System.out.println ("Digita due decimali separati da uno spazio");
		double c,d;
		c=tastiera.nextDouble();
		d=tastiera.nextDouble();
		System.out.println("Hai stampato " +c+" e "+d);

		System.out.println ("Ora digita due parole");
		String e,f;
		e=tastiera.next();
		f=tastiera.next();
		System.out.println("Hai digitato: \""+e+"\" e \"" +f+ "\"");
		e=tastiera.nextLine();
		System.out.println("Digita ora una riga di testo");
		e=tastiera.nextLine();
		System.out.println("Hai digitato \""+ e+ "\"");
	}
}
