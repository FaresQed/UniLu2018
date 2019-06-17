package ex2;

import java.util.Scanner;

public class Comparaison {

	public static void main(String[] args) {
	Scanner clavier = new Scanner(System.in);	
			
		int a = Math.abs(0);
		int b = Math.abs(0);
		
		System.out.println("Entrez le premier chiffre a comparer : ");
		a = clavier.nextInt();
		
		System.out.println("Entrez le second chiffre a comparer : ");
		b = clavier.nextInt();
		
		while (a>b)
		{
			System.out.println( 1 );
		}
		
	}

}
