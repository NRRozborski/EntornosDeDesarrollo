package pruebas;

import static org.junit.Assert.*;
import org.junit.Test;
import fuentes.Calculadora;

public class PruebaSuma {
	@Test
	public void test() {
		System.out.println("Caso de prueba Suma: ");
		Calculadora calculadora = new Calculadora();
		float operando1= 4;
		float operando2= 2;

		assertEquals(6, calculadora.suma(operando1, operando2), 0);
		assertEquals(5, calculadora.suma(operando1, operando2), 0);

	}
}
