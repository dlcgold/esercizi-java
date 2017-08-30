import java.util.Scanner;

public class Scarafaggi
{
public static void main(String [] args)
	{
		Double nscarafaggi, metratura, vscarafaggi;
		int settimane=0;
		String intscarafaggi,volume;
		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire la metratura della casa in m^3:");
		metratura=tastiera.nextDouble();
		System.out.println("Inserire il numero di scarafaggi ora presenti:");
		nscarafaggi=tastiera.nextDouble();
		vscarafaggi=3.2E-5*nscarafaggi;
		System.out.println("Andamento ->");
		while(vscarafaggi<metratura)
			{
				nscarafaggi=nscarafaggi+(0.95*nscarafaggi);
				vscarafaggi=3.2E-5*nscarafaggi;
				intscarafaggi=String.valueOf(nscarafaggi).split("\\.")[0];
				settimane++;
				System.out.println("Settimana " +settimane+"|\t numero scarafaggi=" +intscarafaggi+"\t volume scarafaggi="+vscarafaggi +" m^3");
			}
		intscarafaggi=String.valueOf(nscarafaggi).split("\\.")[0];
		System.out.println("Dopo "+settimane+" settimane la casa (di "+metratura+" m^3) sarà completamente piena di scarafaggi, di numero "+ intscarafaggi+" con volume "+vscarafaggi+" m^3");
	}
}