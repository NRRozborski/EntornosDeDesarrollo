package pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fuentes.Calculadora;

public class PruebaRaiz {
	@Test
	public void test() {
		System.out.println("Caso de prueba Raiz: ");
		Calculadora calculadora = new Calculadora();
		float operando1= 4;
		float operando2= 2;


		assertEquals(2, calculadora.raiz_cuadrada(operando1), 0);
		assertEquals(3, calculadora.raiz_cuadrada(operando1), 0);
	}
}
