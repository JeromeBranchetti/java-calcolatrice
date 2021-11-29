package org.generation.italy.utils;

public class CalcoliTest {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 3;
		int somma = CalcoliHelper.prodotto(a, b);
		String potenza = CalcoliHelper.elevamentoPotenza(0, 0);
		
		System.out.println(somma);
		System.out.println(potenza);
		
	}
}
