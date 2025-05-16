package app;

import clases.TrianguloRectangulo;

public class Principal {

	public static void main(String[] args) {
		int aleatorioA = (int)(Math.random()*(10-1+1)+1);
		int aleatorioB = (int)(Math.random()*(10-1+1)+1);
		TrianguloRectangulo tri = new TrianguloRectangulo(aleatorioA, aleatorioB);
		TrianguloRectangulo tri2 = new TrianguloRectangulo();
		
		//Calcula triangulo con parametros
		tri.hipotenusa();
		tri.area();
		tri.perimetro();
		
		//Calcula triangulo por defecto
		tri2.hipotenusa();
		tri2.area();
		tri2.perimetro();
		
		
	}

}
