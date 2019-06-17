package Ex1;

import java.util.Scanner;

public class Simspons {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		//Déclaration des variables 
		String name;
		String phrase;
		int rep;
		
		
		System.out.println("Veuillez inscrire le nom de l'élève : ");
		name = clavier.nextLine();
		
		System.out.println("Veuillez inscrire la phrase à répeter : ");
		phrase = clavier.nextLine();
		
		System.out.println("Veuillez indiquer le nombre de fois que " + name + " dois répeter " + phrase);
		rep = clavier.nextInt();
		
		
		for (int i = 1; i <= rep; i++) { System.out.println(phrase);}
		
	}

}
