package pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fuentes.Calculadora;

public class PruebaMultiplicacion {
	@Test
	public void test() {
		System.out.println("Caso de prueba Multiplicacion: ");
		Calculadora calculadora = new Calculadora();
		float operando1= 4;
		float operando2= 2;


		assertEquals(8, calculadora.multiplicacion(operando1, operando2), 0);
		assertEquals(7, calculadora.multiplicacion(operando1, operando2), 0);

	}
}
