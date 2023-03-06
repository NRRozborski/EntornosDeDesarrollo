package pruebas;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.junit.runner.JUnitCore;


@RunWith(Suite.class)
@SuiteClasses({ PruebaSuma.class, PruebaResta.class,
	PruebaMultiplicacion.class, PruebaDivision.class, PruebaRaiz.class, PruebaContarLetras.class })
public class AllTests {

}

