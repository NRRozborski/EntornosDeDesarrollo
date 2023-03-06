package pruebas;

import static org.junit.Assert.*;

import org.junit.Test;

import fuentes.ContarLetras;
import org.junit.runner.JUnitCore;

public class PruebaContarLetras {
	@Test
	public void test() {
		System.out.println("Caso de prueba Contar Letras: ");
		ContarLetras contarLetras = new ContarLetras();

		assertEquals(4, contarLetras.contarLetras("abababab", 'a'), 0);
		assertEquals(5, contarLetras.contarLetras("abababab", 'a'), 0);
	}
}
