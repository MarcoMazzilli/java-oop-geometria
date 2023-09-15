package org.lessons.java.geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Rettangolo[] items = new Rettangolo[3];
		
		for (int i = 0; i < items.length; i++) {
				
			System.out.println("Inserisci la base: ");
			int base = sc.nextInt();
			System.out.println("Inserisci l'altezza: ");
			int altezza= sc.nextInt();
			
			
			items[i] = new Rettangolo(base,altezza);
//			System.out.println("Proprieta' oggetto -> " + (i+1));
			items[i].getProperties();
		}
		
		sc.close();
		
		
	}
}
