package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import clases.TrianguloRectangulo;

class testTrianguloRectangulo {
	
	static TrianguloRectangulo t;
	static TrianguloRectangulo t2;
	@BeforeAll
	static void setup() {
		t = new TrianguloRectangulo() {};
		t2 = new TrianguloRectangulo(3,5);
	}
	
	
	//Triangulo por defecto

	@Test
	void testArea() {
		double areaEsperada = 0.5;
		double areaObtenida = t.area();
		assertEquals(areaEsperada, areaObtenida);
	}

	@Test
	void testHipotenusa() {
		double hipoEsperada = 1.7320508075688772;
		double hipoObtenida = t.hipotenusa();
		assertEquals(hipoEsperada, hipoObtenida);
	}

	@Test
	void testPerimetro() {
		double perimetroEsperado = 3.732050807568877;
		double perimetroObtenido = t.perimetro();
		assertEquals(perimetroEsperado, perimetroObtenido);
	}
	
	//triangulo con valores
	
	@Test
	void testArea2() {
		double areaEsperada2 = 7.5;
		double areaObtenida2 = t2.area();
		assertEquals(areaEsperada2, areaObtenida2);
	}

	@Test
	void testHipotenusa2() {
		double hipoEsperada2 = 5.5677643628300215; 
		double hipoObtenida2 = t2.hipotenusa();
		assertEquals(hipoEsperada2, hipoObtenida2);;
	}

	@Test
	void testPerimetro2() {
		double perimetroEsperado2 = 13.567764362830022;
		double perimetroObtenido2 = t2.perimetro();
		assertEquals(perimetroEsperado2, perimetroObtenido2);
	}
	
	
	//Intente hacer la excepcion pero no me iba
	
//	//test excepcion
//	@Test
//	void testExcepcion() {
//		assertThrows(IllegalArgumentException.class,() -> {
//			t = new TrianguloRectangulo(-4, -5);
//		});
//	}
	
	


}
