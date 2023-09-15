package org.lessons.java.geometria;

public class Rettangolo {
	
	//PROPERTIES
	public int base;
	public int altezza;
	public int area;
	public int perimetro;
	//PROPERTIES
	
	//CONTRUCTOR
	Rettangolo() {
		this.base = 0;
		this.altezza = 0;
		this.area = 0;
		this.perimetro = 0;
	}
	
	Rettangolo(int base, int altezza){
		this();
		
		this.base = base;
		this.altezza = altezza;
		
		setArea();
		setPerimetro();
	}
	//CONTRUCTOR
	
	//GETTER
	public void getProperties(){
		System.out.println("Base: " + this.base);
		System.out.println("Altezza: " + this.altezza);
		System.out.println("area: " + this.area);
		System.out.println("perimetro: " + this.perimetro);
	}
	
	//SETTER
	public void setArea(){
		this.area = base * altezza;
	}
	
	
	public void setPerimetro(){
		this.perimetro = (base*2) + (altezza*2);
	}
}
