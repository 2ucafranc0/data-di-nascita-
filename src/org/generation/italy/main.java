package org.generation.italy;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner (System.in);
		
		int giorno,mese,anno,giorniMese;
		
		do
		{
			System.out.println("Inserisci il mese: ");
			mese= Integer.parseInt(sc.nextLine());
		
			if (mese>1 || mese<12) {
				
				System.out.println("Meso non valido ");
		}
		}	
	    while (mese<=1 || mese>=12); 
		
	    if (mese==9 || mese==4 || mese==6 || mese==11) 
	    {
	    	giorniMese = 30;
	    }	
	    else 
	    {
	    	   if (mese==2)
	    	   {
	    		   giorniMese = 28;
	    	   }
	    	   else
	    	   {
	    		   giorniMese = 31;
	    	   }
	    }
	    
		do
		{
			System.out.println("Buongiorno, inserisci la data di nascita, che giorno sei nato?");
			giorno = Integer.parseInt(sc.nextLine());
		
			if(giorno<=0||giorno>giorniMese)
			{
				System.out.println("Il giorno è sbagliato, riprova.");
			}
			
		}
		while(giorno<=0||giorno>giorniMese);
		
		do
		{
			System.out.print("Inserisci anno: ");
			anno = Integer.parseInt(sc.nextLine());
			
			if(anno>1900&&anno<2023)
			{
				System.out.println("Sei nato il "+giorno+"/"+mese+"/"+anno);
			}
			else
			{
				System.out.println("La cifra inserita non rientra nella domanda.");
			}
		}
		while(anno<1900||anno>2023);
	    	
	    sc.close();
	}

}
