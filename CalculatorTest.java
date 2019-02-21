package package1;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void monthly_payementtest() {
		Calculator calc = new Calculator(100, 0, 0, 3);
		String actual = calc.monthly_payement();
		String expected = "33.33";
		assertTrue(actual.equals(expected));
	}	
	@Test
	void subtotaltest() {
		Calculator calc = new Calculator(100, 0, 0, 3);
		String actual = calc.subtotal();
		String expected = "99.99";
		assertTrue(actual.equals(expected));
	}
	@Test
	void remaindertest() {
		Calculator calc = new Calculator(100, 0, 0, 3);
		String actual = calc.remainder();
		String expected = ".01";
		assertTrue(actual.equals(expected));
	}	
	@Test
	void interesttest() {
		Calculator calc = new Calculator(100, 0, 0, 3);
		String actual = calc.interest();
		String expected = "0";
		assertTrue(actual.equals(expected));
	}
	@Test
	void last_payementtest() {
		Calculator calc = new Calculator(100, 0, 0, 3);
		String actual = calc.last_payement();
		String expected = "33.34";
		assertTrue(actual.equals(expected));
	}
}
