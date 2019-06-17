package Ex5;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0;
		int calc = n1*n2 ;  
		
		System.out.println("Veuillez entrer le premier entier");
		n1 = clavier.nextInt();
		System.out.println("Veuillez entrer le second entier");
		n2 = clavier.nextInt();

		
		if (calc < 0) { 
			System.out.println("Le Produit des ces deux chiffres est Négatif (-) ");
		} else {
			System.out.println("Le Produit des ces deux chiffres est Positif (+) ");
		}
		
		
	}

}
