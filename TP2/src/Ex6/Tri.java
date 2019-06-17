package Ex6;

import java.util.Scanner;

public class Tri {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		int n1 = 0;
		int n2 = 0; 
		int n3 = 0;
		
		System.out.println("Entrez le premier nombre");
		n1 = clavier.nextInt();
		
		System.out.println("Entrez le deuxième nombre");
		n2 = clavier.nextInt();
		
		System.out.println("Entrez le troisième nombre");
		n3 = clavier.nextInt();
		
		    //123
		if (n1 < n2 && n2<n3 && n1<n3 ) { 
			System.out.println("Voici l'ordre croissant : " + n1 + "," + n2 + ","  + n3);
			//132
		}  else if (n1<n3 && n3<n2 && n1<n2 ) {
			System.out.println("Voici l'ordre croissant : " + n1 + "," + n3 + ","  + n2);
			//213
		}  else if (n2<n1 && n1<n3 && n2<n3 ) {
			System.out.println("Voici l'ordre croissant : " + n2 + "," + n1 + ","  + n3);
			//231
		}  else if (n2<n3 && n3<n1 && n2<n1 ) {
			System.out.println("Voici l'ordre croissant : " + n2 + "," + n3 + ","  + n1);
			//321
		}  else if (n3<n2 && n2<n1 && n3<n1 ) {
			System.out.println("Voici l'ordre croissant : " + n3 + "," + n2 + ","  + n1);
			//312
		}  else if (n3<n2 && n1<n2 && n3<n2)  {
			System.out.println("Voici l'ordre croissant : " + n3 + "," + n1 + ","  + n2);
		
		}
		
	}

}
