import java.util.Scanner;

public class BMI
{
public static void main(String [] args)
	{
	 double pesokg, pesolb, piedi, pollici, metri, bmi;
	 Scanner tastiera=new Scanner(System.in);
	 System.out.println("inserisci il tuo peso in libbre(1 libbra=2,2 kg):");
	 pesolb=tastiera.nextDouble();
	 pesokg=2.2*pesolb;
	 System.out.println("Il peso in libbre inserito ("+pesolb+" lb) corrisponde a "+pesokg+" kili");

	 System.out.println("inserisci la tua altezza in piedi (1 piede= 12 pollici e 1 pollice= 0,0254 metri ):");
	 piedi=tastiera.nextDouble();
	 pollici=12*piedi;
	 metri=0.0245*pollici;
	 System.out.println("L'altezza inserita in piedi ("+piedi+" feet) corrisponde a "+pollici+" inch e a "+metri+" metri");
	 System.out.println("Calcolo del BMI in corso...");
	 bmi=pesokg/(metri*metri);
	 System.out.println("Il tuo indice di massa corporea (BMI) è: "+bmi);
	 if(bmi<18.5)
	 		System.out.println("Sei anoressico");
	 	else if((bmi>=18.5)&&(bmi<25))
	 		System.out.println("Sei del giusto peso");
	 	else if((bmi>=25)&&(bmi<30))
	 		System.out.println("Sei sovrappeso");
	 	else
	 		System.out.println("Seo obeso");
	}
}	