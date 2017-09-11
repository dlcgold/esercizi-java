import java.util.Scanner;

public class SelectionSort
{
	public static void main(String [] args)
	{
		System.out.println("Inserire il numero di dati da riodinare: ");
		int n;
		Scanner tastiera= new Scanner(System.in);
		n=tastiera.nextInt();
		int [] numeri= new int[n];
		System.out.println("Inserire "+n+" numeri interi: ");

			for(int i=0;i<n;i++)
			{
				numeri[i]=tastiera.nextInt();
			}

		System.out.println("Ecco il vettore: ");
		for(int i=0;i<n;i++)
			System.out.print(numeri[i]+ " ");
		System.out.println();

		SelectionSortArray(numeri,n);
		System.out.println("Ecco il vettore riodinato: ");
		for(int i=0;i<n;i++)
			System.out.print(numeri[i]+ " ");
		System.out.println();
	}

	public static void SelectionSortArray(int [] list, int lenght)
	{
		int min;
  		int var;
  		for(int a=0; a< lenght -1;a++)
 		{	
   	   		min=a;
	        for(int minx= a+1;minx<lenght;minx++)
	        if(list[minx]<list[min])
	        min= minx;
	        var=list [min];
	        list[min]=list[a];
	        list[a]=var;
		}
	}
}