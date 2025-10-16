package arithmetic;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import arithmetic.Calculator.Operator;

public class TestCalculator {
	private Calculator calculator;
	
	@Before
	public void setup() {
		calculator = new Calculator();
	}
	
	@Test
	public void testAdd() {
		assertEquals(2, calculator.integerCalc(1, 1, Operator.ADD));
		assertEquals(2, calculator.integerCalc(0, 2, Operator.ADD));
		assertEquals(5, calculator.integerCalc(0, 5, Operator.ADD));
		assertEquals(5, calculator.integerCalc(2, 3, Operator.ADD));
		assertEquals(5, calculator.integerCalc(5, 0, Operator.ADD));
	}
}
