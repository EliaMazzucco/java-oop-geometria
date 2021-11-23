package org.generation.italy.geometria;

public class Rettangolo {

	//attributi
	
	int base;
	int altezza;
	
	//costruttore
	
	Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	//metodi
	
	//calcola area
	int area () {		
		return base * altezza;
	}
	
	
	//calcolo perimetro
	int perimetro () {		
		return ((base *2) + (altezza*2));		
	}
	
	
}
