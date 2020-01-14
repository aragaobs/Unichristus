package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import functionality.Calculator;

class CalculatorTest {

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	void testsoma() {
		double primeirovalor = 10.0;
		double segundovalor = 2.0;
		final double resultado = new Calculator().calculate(primeirovalor, segundovalor, "+");

		assertEquals(12.0, resultado);
		
		
	}

}
