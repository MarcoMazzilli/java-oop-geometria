package org.lessons.java.geometria;

public class Rettangolo {

	public int base;
	public int altezza;
	
	Rettangolo() {
		this.base = 0;
		this.altezza = 0;
	}
	
	Rettangolo(int base, int altezza){
		this.base = base;
		this.altezza = altezza;
	}
	
	public void getProperties(){
		System.out.println("Base: " + this.base);
		System.out.println("Altezza: " + this.altezza);
	}
}
