package arithmetic;

public class Calculator {
	enum Operator { ADD, DIVIDE, MOD, MULTIPLY, SUBTRACT };
	
	public int integerCalc(int a, int b, Operator operator) {
		switch (operator) {
		case ADD:
			return a + b;
		case DIVIDE:
			return a / b;
		case MOD:
			return a % b;
		case MULTIPLY:
			return a * b;
		case SUBTRACT:
			return a - b;
		default:
			throw new UnsupportedOperationException();
		}
	}
}
