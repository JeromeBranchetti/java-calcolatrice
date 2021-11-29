package org.generation.italy.utils;

public class CalcoliHelperBonus {
	
	//attributi
	
	static int risultato;
	
	private CalcoliHelperBonus() {
		// non può essere instanziato
	}
	
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
	
	public static int elevamentoPotenza(int base, int esponente) {
		if (operazioneLecita(base, esponente)) {
			if (base == 0) {
				risultato = 0;
				
			}
			else {
				risultato = 1;
				for (int i = 1; i <= esponente ; i++) {
					risultato *= base;
				}
			}
		}
		return risultato;
	}

}
