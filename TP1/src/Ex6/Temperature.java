package Ex6;

import java.util.Scanner;

public class Temperature {

	public static void main(String[] args) {
		Scanner clavier = new Scanner(System.in);
		
		double TempC = 0.0;
		
		System.out.println("veuillez entrer la température en Celsius");
        TempC = clavier.nextDouble();
        
        double TempF = (TempC*(9/5))+32;
        
        System.out.println( TempC + "C° donne " + TempF + "F°");
       
        
	}

}
