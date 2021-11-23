package org.generation.italy.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {		
		Scanner scan = new Scanner(System.in);
		System.out.println("Inserisci la base e l'altezza: ");
		
			
		int base = scan.nextInt();
		int altezza = scan.nextInt(); 
		
		
		Rettangolo R = new Rettangolo (base, altezza);
		int a = R.area();
		System.out.println("L'area è: " + a);
		int p = R.perimetro();
		System.out.println("Il perimetro è: " + p);
				
		scan.close();
	}

}
