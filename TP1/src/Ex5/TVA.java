package Ex5;

import java.util.Scanner;

public class TVA {

	public static void main(String[] args) {
		
		double Unitprice = 0.0 ;
		double nbrofproducts = 0.0 ;
		double taxe = 0.0 ;
		
		Scanner clavier = new Scanner(System.in);
		
		System.out.println("Entrez le Prix à l'unité");
		Unitprice = clavier.nextDouble();
		
		System.out.println("Entrez la quantité de ce produit");
		nbrofproducts = clavier.nextDouble();
		
		System.out.println("Entrez la TVA applicable à ce produit");
		taxe = clavier.nextDouble();
		
		System.out.println("Prix total HT : " + Unitprice*nbrofproducts );
		System.out.println("Montant TVA : " + taxe );
		System.out.println("Prix Total TTC : " + ((Unitprice*nbrofproducts)*(1+taxe/100)) );
		
	}

}
