package org.generation.italy.geometria;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		        
		        Scanner scan = new Scanner(System.in);
		        int base, altezza;
//		        int altezza;
		        
		        do {
		            System.out.println("Inserisci la base e l'altezza: ");
		            base = scan.nextInt(); 
		            altezza = scan.nextInt(); 
		            
		        } while(base == altezza);
		        
		        
		        Rettangolo R = new Rettangolo (base, altezza);
//		        int a = R.area();
//		        int p = R.perimetro();
		    
		        System.out.println("L'area       : " + R.area() + "\n" +
		                           "Il perimetro : " + R.perimetro());
		                
		        scan.close();
		    }

		

	}


