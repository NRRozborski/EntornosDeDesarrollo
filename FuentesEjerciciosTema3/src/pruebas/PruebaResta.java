package pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fuentes.Calculadora;

public class PruebaResta {

	@Test
	public void test() {
		System.out.println("Caso de prueba Resta: ");
		Calculadora calculadora = new Calculadora();
		float operando1= 4;
		float operando2= 2;


		assertEquals(2, calculadora.resta(operando1, operando2), 0);
		assertEquals(3, calculadora.resta(operando1, operando2), 0);

	}

}
