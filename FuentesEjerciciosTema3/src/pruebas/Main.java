package pruebas;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import pruebas.AllTests;

public class Main {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(AllTests.class);
		System.out.println("N� de casos ejecutados "+result.getRunCount());
		if(result.wasSuccessful()){ 
			System.out.println("TODO OK");
		}
		System.out.println("Fallos: ");
		for(Failure f: result.getFailures()) {
			System.out.println(f.toString());
		}
	}

}
