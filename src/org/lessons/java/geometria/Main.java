package org.lessons.java.geometria;

public class Main {

	public static void main(String[] args) {
		
		Rettangolo item1 = new Rettangolo();
		
		System.out.println("Base :" + item1.base);
		System.out.println("Altezza :" + item1.altezza);
		
		Rettangolo item2 = new Rettangolo(10,5);
		item2.getProperties();
	}
}
