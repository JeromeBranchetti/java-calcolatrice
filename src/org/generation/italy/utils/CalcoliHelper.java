package org.generation.italy.utils;

public class CalcoliHelper {
	
	private CalcoliHelper() {
	// non può essere instanziata	
	}
	public static int somma(int a, int b) {
		return a + b;
	}
	
	public static double somma(double a, double b) {
		return a + b;
	}
	
	public static int differenza(int a, int b) {
		return a - b;
	}
	
	public static double differenza(double a, double b) {
		return a - b;
	}
	
	public static int prodotto(int a, int b) {
		return a * b;
	}
	
	public static double prodotto(double a, double b) {
		return a * b;
	}
	
	public static int valoreAssoluto(int a) {
		if (a < 0) {
			return a * (-1);
		}
		else {
			return a;
		}
	}
	
	public static double valoreAssoluto(double a) {
		if (a < 0) {
			return a * (-1.0);
		}
		else {
			return a;
		}
		
	}
	
	public static int minimoTra(int a, int b) {
		if (a <= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static double minimoTra(double a, double b) {
		if (a <= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static int massimoTra(int a, int b) {
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	public static double massimoTra(double a, double b) {
		if (a >= b) {
			return a;
		}
		else {
			return b;
		}
	}
	
	// 
	public static boolean operazioneLecita(int base, int esponente) {
		if (base != 0 && esponente != 0) {
			return true;
		}
		else if(base == 0 && esponente != 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static int elevamentoPotenzaOperazione(int base, int esponente) {
		int risultato;
	
		if (base == 0) {
			risultato = 0;
			
		}
		else {
			risultato = 1;
			for (int i = 1; i <= esponente ; i++) {
				risultato *= base;
			}
		}
		
		return risultato;
	}
	public static String elevamentoPotenza(int base, int esponente) {
		if (operazioneLecita(base, esponente)) {
			return Integer.toString(elevamentoPotenzaOperazione(base, esponente));
		}
		else {
			return "Errore" ;
		}
	}
	
}
