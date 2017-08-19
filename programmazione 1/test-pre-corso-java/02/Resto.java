import java.util.*;
public class Resto
{
	public static void main(String[] args)
	{
		float costo;
		float pagato;
		float quantita;
		int valore;
		int cinquecentoeuro, duecentoeuro, centoeuro, cinquantaeuro, ventieuro, diecieuro, cinqueuro , uneuro, dueuro, cinquantacent, venticent, diecicent, cinquecent, duecent, uncent;
		System.out.println("Inserisci il costo del prodotto (usa la virgola per i decimali, inserire i decimali in maniera completa (es. No 14,8 | SI 14,80 ))");
		Scanner tastiera = new Scanner (System.in);
		
		costo=tastiera.nextFloat();
		System.out.println("Inserisci la cifra con cui si intende pagare");
		pagato=tastiera.nextFloat();
		quantita=pagato-costo;
		quantita= quantita*100;
			valore= (int) quantita;
	
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
				
						System.out.println("Si ha, per il seguente resto("+quantita/100+" euro), la seguente scomposizione:");
						System.out.println(cinquecentoeuro + " banconote da 500 euro");
						System.out.println(duecentoeuro + " banconote da 200 euro");
						System.out.println(centoeuro + " banconote da 100 euro");
						System.out.println(cinquantaeuro + " banconote da 50 euro");
						System.out.println(ventieuro + " banconote da 20 euro");
						System.out.println(diecieuro + " banconote da 10 euro");
						System.out.println(cinqueuro + " banconote da 5 euro");
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
