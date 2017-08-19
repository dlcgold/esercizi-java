import java.util.*;
import javax.swing.JOptionPane;
public class stringa
{
	public static void main(String[] args)
	{
		System.out.println("Analisi della stringa \"dlcgold\":");
		String parola= "dlcgold";
		String paroladue= "Dlcgold";
		int uno = parola.length();
		
                System.out.println(parola + " e' di lunghezza: " + uno);
		char c1 = parola.charAt(0);
		System.out.println("Prima lettera: " + c1);
		System.out.println(" ");
		
		System.out.println("Qualche comparazione tra String: ");
		boolean b = parola.equals(paroladue);
		System.out.println("\"dlcgold\" e \"Dlcgold\" sono uguali? " + b);
		System.out.println("\"dlcgold\" e \"dlcgold\"  sono uguali? " + parola.equals("dlcgold"));
		
		boolean b2 = parola.equalsIgnoreCase(paroladue);
		System.out.println("\"dlcgold\" e \"Dlcgold\" sono uguali, ignorando maiuscole e minuscole? " + b2);
		System.out.println("\"dlcgold\" e \"dlCgoLd\"  sono uguali, ignorando maiuscole e minuscole? " + parola.equalsIgnoreCase("dlCgoLd"));
		System.out.println(" ");
		
		System.out.println("Up case e lower case:");
		String parolatre = paroladue.toLowerCase();
		System.out.println("Riduciamo "+ paroladue +" in minuscolo: " +parolatre);		
		String parolaquattro = paroladue.toUpperCase();
		System.out.println("Mettiamo "+ paroladue +" in maiuscolo: " +parolaquattro);
		System.out.println(" ");

		System.out.println("Sottostringhe: ");
		System.out.println("Togliamo le prime due lettere: "+parola.substring(2));
		System.out.println("Teniamo le lettere solo dalla 3 alla 5: " +parola.substring(2,5));
		System.out.println("Teniamo le lettere solo dalla 1 alla 3 e le mettiamo maiuscole: " +parola.substring(0,3).toUpperCase());
		System.out.println(" ");

		System.out.println("Ordine lessicografico: ");
		String parolacinque= JOptionPane.showInputDialog("inserire parola da comparare");
		int a= parola.compareTo(parolacinque);
		if (a==0){
		System.out.println(parola +" e "+parolacinque+" sono uguali ");
			} 
		else if(a<0){
		System.out.println(parola+" viene prima di"+parolacinque);
			    }
		else{
		System.out.println(parolacinque+ " viene prima di "+parola);
		    }

	}
}
	
