package Ex7;

import java.util.Scanner;

public class Heure {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int heure, min, sec = 01;
		int HourFormat;
		
	//Format Heure	
	System.out.println("Veuillez entrer le format d'heure souhaité (12 pour AM ou 24 pour PM)");
	HourFormat = clavier.nextInt();	
	
	
	////////////
    //12 AM
	if (HourFormat == 12 ) 
	{ //Heure
	System.out.println("Veuillez entrer l'heure ");
	heure = clavier.nextInt();
	}
	else 
	{ 
    //Erreur Format
	System.out.println("Erreur : Veuillez entrer 12 pour AM ou 24 pour PM");
	heure = clavier.nextInt();
	}
	//Erreur heure 
	if ( heure < 01 && heure > 12) 
	{
	System.out.println("Erreur : Veuillez entrer une heure correcte ");	
	}
	else	
	//Minutes
	System.out.println("Veuillez entrer les minutes ");
	min = clavier.nextInt();	
	//Erreur Minutes	
	if ( min < 01 && min > 59) 
	{
	System.out.println("Veuillez entrer un format correcte ");	
	}		
	else
	{	
	System.out.println("Veuillez entrer les secondes ");
	sec = clavier.nextInt();
	}
	//Erreur Secondes
	if ( sec < 01 && sec > 59)
	System.out.println("Veuillez entrer un format correcte ");	
	else if (  min == 59 && sec == 59 ) 
	{
	//resultat 59
    System.out.println("il est " + (heure+1) +"H "+ 0 + "min " + 0 + "sec");				
	}
	else 
	{
	System.out.println("il est " + heure + "H "+ min + "min " + sec + "sec");
	}	
	
	
	
	   }	
	}  


