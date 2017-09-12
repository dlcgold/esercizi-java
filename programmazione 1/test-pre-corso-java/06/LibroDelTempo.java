import java.util.Scanner;

public class LibroDelTempo
{
	private int numeroDiDipendenti;
	private int [][] ore;
	private int [] oreSettimana;
	private int[] oreGiorno;

	private static final int giorni=5;
	private static final int lun=0;
	private static final int mar=1;
	private static final int mer=2;
	private static final int gio=3;
	private static final int ven=4;

	public LibroDelTempo(int ilnumeroDiDipendenti)
	{
		numeroDiDipendenti=ilnumeroDiDipendenti;
		ore=new int [giorni][numeroDiDipendenti];
		oreSettimana=new int[numeroDiDipendenti];
		oreGiorno=new int [giorni];
	}

	public void setOre()
	{
		ore[0][0]=8;ore[0][1]=0;ore[0][2]=9;
		ore[1][0]=8;ore[1][1]=0;ore[1][2]=9;
		ore[2][0]=8;ore[2][1]=8;ore[2][2]=8;
		ore[3][0]=8;ore[3][1]=8;ore[3][2]=4;
		ore[4][0]=8;ore[4][1]=8;ore[4][2]=8;
	}

	public void aggiorna()
	{
		calcolaOreSettimana();
		calcolaOreGiorno();
	}

	private void calcolaOreSettimana()
	{
		for(int dip=1;dip<=numeroDiDipendenti;dip++)
		{
			int somma=0;
			for(int g=lun;g<=ven;g++)
				somma=somma+ore[g][dip-1];
			oreSettimana[dip-1]=somma;
		}
	}

	private void calcolaOreGiorno()
	{
		for(int g=lun;g<=ven;g++)
		{
			int somma=0;
			for(int dip=1;dip<=numeroDiDipendenti;dip++)
				somma=somma+ore[g][dip-1];
			oreGiorno[g]=somma;

		}
	}

	public void visualizzaTabella()
	{
		System.out.print("Dipendente ");
		for(int dip=1;dip<=numeroDiDipendenti;dip++)
			System.out.print(dip+" ");
		System.out.println("Totali");
		System.out.println();

		for(int g=lun;g<=ven;g++)
		{
			System.out.print(getNomeGiorno(g)+" ");
			for(int c=0;c<ore[g].length;c++)
				System.out.print(ore[g][c]+" ");
			System.out.println(oreGiorno[g]);
		}
		System.out.println();
		System.out.print("Totale:    ");
		for(int c=0;c<numeroDiDipendenti;c++)
			System.out.print(oreSettimana[c]+" ");
		System.out.println();
	}

	private String getNomeGiorno(int g)
	{
		String nome=null;

		switch(g)
		{
			case lun:
			nome="Lunedì    ";
			break;

			case mar:
			nome="Martedì   ";
			break;

			case mer:
			nome="Mercoledì ";
			break;

			case gio:
			nome="Giovedì   ";
			break;

			case ven:
			nome="Venerdì   ";
			break;

			default:
			System.out.println("Errore Fatale");
			System.exit(0);
			break;
		}
		return nome;
	}


	public static void main(String[] args)
	{
		final int Dipendenti=3;
		LibroDelTempo libro=new LibroDelTempo(Dipendenti);
		libro.setOre();
		libro.aggiorna();
		libro.visualizzaTabella();
	}
}