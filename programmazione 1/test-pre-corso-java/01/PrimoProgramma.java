import java.util.Scanner;
public class PrimoProgramma 
{
	public static void main(String[] args)
	{
		System.out.println("Questo è il mio primo programma in java");
		System.out.println("Esegue la somma di due interi, scritti sulla stessa riga");

			int a,b;
		
				Scanner tastiera = new Scanner (System.in);
		
				a=tastiera.nextInt();
				b=tastiera.nextInt();
		
				System.out.println("Ecco la somma");

				System.out.println(a+b);
	
}
	}
