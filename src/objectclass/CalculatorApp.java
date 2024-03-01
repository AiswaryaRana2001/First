package objectclass;



 
public class CalculatorApp {
    public static void main(String[] args) {
    	Calculator calculator = new Calculator();
        
        // Test cases
        try {
            int dividend = 10;
            int divisor = 2;
            double result = calculator.divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            int dividend = 10;
            int divisor = 0;
            double result = calculator.divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        try {
            int dividend = -10;
            int divisor = 5;
            double result = calculator.divide(dividend, divisor);
            System.out.println("Result of division: " + result);
        } catch (ArithmeticException | IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}