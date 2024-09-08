package mypackage.java;

public class Division extends Calculation{

    @Override
    public double calculate(double a, double b) {
        if (b == 0) {
            ArithmeticException er= new ArithmeticException("Division by zero is not allowed.");
            throw er;
        }
            return a/b;

    }
}
