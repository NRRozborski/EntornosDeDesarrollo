package pruebas;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import fuentes.Calculadora;

public class PruebaDivision {
	@Test
	public void test() {
		System.out.println("Caso de prueba Division: ");
		Calculadora calculadora = new Calculadora();
		float operando1= 4;
		float operando2= 2;


		assertEquals(2, calculadora.division(operando1, operando2), 0);
		assertEquals(3, calculadora.division(operando1, operando2), 0);

	}
}
