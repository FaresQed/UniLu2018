package ex4;

import java.util.Scanner;

public class USA {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		double tempC ; 
		
        System.out.println("Entrez la température de l'eau en C° : ");
        tempC = clavier.nextDouble();
        
        if ( tempC < 0) 
        	System.out.println("L'eau sera a l'état solide (glace) ");      
        	  
        	else if( tempC >= 100)
        	  System.out.println("L'eau sera a l'état gazeux (vapeur) ");           
        	 
        	else  
        	  System.out.println("L'eau sera a l'état liquide ");
        	}
        
	}


