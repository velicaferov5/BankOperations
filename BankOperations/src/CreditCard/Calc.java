package CreditCard;

import java.util.Arrays;
import java.util.Stack;
import java.util.function.BiFunction;

public class Calc {

	  public double evaluate(String expr) {
	    // TODO: Your code here
		  Stack<Double> numbers = new Stack<>();
	        Arrays.asList(expr.split(" ")).stream().forEach(number -> {
	            switch(number) {
	                case "+":
	                	CalculateSign(numbers, (n1, n2) -> n2 + n1);
	                    break;
	                case "-":
	                	CalculateSign(numbers, (n1, n2) -> n2 - n1);
	                    break;
	                case "*":
	                	CalculateSign(numbers, (n1, n2) -> n2 * n1);
	                    break;
	                case "/":
	                	CalculateSign(numbers, (n1, n2) -> n2 / n1);
	                    break;
	                default:
	                    numbers.push(Double.parseDouble(number));
	            }
	        });
	        return numbers.pop();
	    }
	 
	    protected static Stack<Double> CalculateSign(Stack<Double> numbers, BiFunction<Double, Double, Double> operation) {
	        numbers.push(operation.apply(numbers.pop(), numbers.pop()));
	        return numbers;
	    }
	}