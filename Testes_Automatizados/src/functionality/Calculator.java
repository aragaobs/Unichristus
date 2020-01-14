package functionality;

public class Calculator {
	
	 public double calculate(double number1, double number2, String operator) {
	        switch (operator) {
	            case "+":
	                return number1 + number2;
	            case "-":
	                return number1 - number2;
	            case "*":
	                return number1 * number2;
	            case "/":
	                return number1 / number2;
	            default:
	                throw new IllegalArgumentException("invalid operator");
	        }
	    }


}
