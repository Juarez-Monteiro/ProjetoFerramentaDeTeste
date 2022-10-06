package com.teste.projeto.model;

public class CalcularVolume {

	public static double largura;
	public static double altura;
	public static double comprimento;
	public static double raio;
	public static double h;
	public static double r;
	
	public static void main(String[] args) {
		CalcularVolume cm = new CalcularVolume();
		
	}
	
	public double volumeParalepipado(double largura, double altura,double comprimento) { 
		if(largura > 0 && altura > 0 && comprimento > 0) {
			return  largura*altura*comprimento;
		}
		return -1;
	
	}
		
	public double volumeCilindro(double raio, double h) { 
		if(raio > 0 && h > 0) {
			return  Math.PI*(raio*raio)*h;
		}
		return -1;
	}	
	
	public double volumeEsfera(double r) { 
		if(r > 0) {
			return  (4*Math.PI*(r*r*r))/3;
		}
		return -1;
	}
}
