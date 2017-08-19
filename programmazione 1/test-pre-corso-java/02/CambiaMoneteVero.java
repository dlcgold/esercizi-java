import java.util.*;
public class CambiaMoneteVero
{
	public static void main(String[] args)
	{
		float quantita;
		int valore;
		int cinquecentoeuro, duecentoeuro, centoeuro, cinquantaeuro, ventieuro, diecieuro, cinqueuro , uneuro, dueuro, cinquantacent, venticent, diecicent, cinquecent, duecent, uncent;
		System.out.println("Inserisci una cifra (usa la virgola per i decimali, inserire i decimali in maniera completa (es. No 14,8 | SI 14,80 ), si troverà la miglior combinazione di banconote e monete per quella cifra");
		Scanner tastiera = new Scanner (System.in);
		quantita=tastiera.nextFloat();
		//System.out.println(quantita);
		quantita= quantita*100;
			valore= (int) quantita;
				//System.out.println(valore);
	
				cinquecentoeuro=valore/50000;
				valore=valore%50000;
				duecentoeuro=valore/20000;
				valore=valore%20000;
				centoeuro=valore/10000;
				valore=valore%10000;
				cinquantaeuro=valore/5000;
				valore=valore%5000;
				ventieuro=valore/2000;
				valore=valore%2000;
				diecieuro=valore/1000;
				valore=valore%1000;
				cinqueuro=valore/500;
				valore=valore%500;
				dueuro=valore/200;
				valore=valore%200;
				uneuro=valore/100;
				valore=valore%100;
					cinquantacent=valore/50;
					valore=valore%50;
					venticent=valore/20;
					valore=valore%20;
					diecicent=valore/10;
					valore=valore%10;
					cinquecent=valore/5;
					valore=valore%5;
					duecent=valore/2;
					valore=valore%2;
					uncent=valore/1;
					valore=valore%1;
				
						System.out.println("Si ha, per la cifra inserita ("+quantita/100+" euro), la seguente scomposizione:");
						System.out.println(cinquecentoeuro + " monete da 500 euro");
						System.out.println(duecentoeuro + " monete da 200 euro");
						System.out.println(centoeuro + " monete da 100 euro");
						System.out.println(cinquantaeuro + " monete da 50 euro");
						System.out.println(ventieuro + " monete da 20 euro");
						System.out.println(diecieuro + " monete da 10 euro");
						System.out.println(cinqueuro + " monete da 5 euro");
						System.out.println(dueuro + " monete da 2 euro");
						System.out.println(uneuro + " monete da 1 euro");
						System.out.println(cinquantacent + " monete da 50 centesimi");
						System.out.println(venticent + " monete da 20 centesimi");
						System.out.println(diecicent + " monete da 10 centesimi");
						System.out.println(cinquecent + " monete da 5 centesimi");
						System.out.println(duecent + " monete da 2 centesimi");
						System.out.println(uncent + " monete da 1 centesimi");
	}
}
