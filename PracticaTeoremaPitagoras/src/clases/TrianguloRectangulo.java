package clases;

public class TrianguloRectangulo {
	private int a; //cateto 1
	private int b; //cateto 2
	private double c; //hipotenusa
	public TrianguloRectangulo() {
		this.a = 1;
		this.b = 1;
	}
	
	public TrianguloRectangulo(int catetoA, int catetoB) {
		if(catetoA <= 0 || catetoB <= 0) {
			try {
				this.a = catetoA;
				this.b = catetoB;
			} catch (IllegalArgumentException fallo) {
				System.out.print("Error. valores introducidos no validos");
			}
		}
	}
	
	/**
	 * Metodo que devuelve el area del triangulo rectangulo
	 * @return area del triangulo rectangulo
	 * */
	
	public int area() {
		return (this.a * this.b)/2;
	}
	
	
	/**
	 * Metodo que devuelve la hipotenusa del triangulo rectangulo
	 * @return hipotenusa del triangulo rectangulo
	 * */
	
	public double hipotenusa() {
		int suma = (this.a+this.a) + (this.b*this.b);
		this.c = Math.sqrt(suma);
		return this.c;
	}
	
	
	/**
	 * Metodo que devuelve el perimetro del triangulo rectangulo
	 * @return perimetro del triangulo rectangulo
	 * */
	public double perimetro() {
		return this.a + this.b + this.hipotenusa();
	}
	
	//Getters
	public int getA() {
		return this.a;
	}
	
	public int getB() {
		return this.b;
	}
	
	public double getC() {
		return this.c;
	}
	
	//Setters
	public void setA(int catA) {
		this.a = catA;
	}
	
	public void setB(int catB) {
		this.a = catB;
	}
	
	public void setC(double hipo) {
		this.c = hipo;
	}
	
	/**
	 * ToString que devuelve los catetos y la hipotenusa del triangulo rectangulo
	 * @return lados del triangulo rectangulo
	 * */
	//toString
	public String toString() {
		String res = "";
		res+= "Cateto A: " + this.a + "\n";
		res+= "Cateto B: " + this.b + "\n";
		res+= "Hipotenusa: " + this.hipotenusa() + "\n";
		return res;
	}
}
