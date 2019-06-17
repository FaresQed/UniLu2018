package Ex4;

import java.util.Scanner;

public class Evaluation {

	public static void main(String[] args) {
	 Scanner clavier = new Scanner(System.in);
	 
	 double firstgrade = 0.0;
	 double secondgrade = 0.0;
	 double finalgrade = 0.0;
	 
	 System.out.println("Veuillez entrer la première note : ");
	 firstgrade = clavier.nextDouble();
	 
	 System.out.println("Veuillez entrer la seconde note : ");
	 secondgrade = clavier.nextDouble();
	 
	 System.out.println("Veuillez entrer la note de l'examen final : ");
	 finalgrade = clavier.nextDouble();

	 System.out.println("Voici les notes que vous avez entrés : ");
	 
	 System.out.println("Premiere evaluation pratique : " + firstgrade );  
	 System.out.println(" Deuxième évaluation pratique : " + secondgrade ); 
     System.out.println(" Examen final : " + finalgrade );
	 System.out.println(" La moyenne de l'élève est de : " + ((firstgrade/20*4)+(secondgrade/20*4)+(finalgrade/20*12)) + "/20");
	 
	}

}
