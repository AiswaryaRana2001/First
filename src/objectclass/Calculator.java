package objectclass;

class Calculator{
    public double divide(int dividend, int divisor) {
        if (divisor == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        if (dividend < 0 || divisor < 0) {
            throw new IllegalArgumentException("Both dividend and divisor must be non-negative");
        }
        return (double) dividend / divisor;
    }
}