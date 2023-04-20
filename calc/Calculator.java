package calc;

public class Calculator {

    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int subtract(int value1, int value2) {
        return value2 - value1;
    }

    public int multiply(int value1, int value2) {
        return value1 * value2;
    }

    public int divide(int value1, int value2) {
        return value1 / value2;
    }

    public int square(int value1) {
        return value1 * value1;
    }

    public int squareRoot(double value1) {
        return (int) Math.sqrt(value1);
    }

    public int exponent(int value1, int value2) {
        return (int) Math.pow(value1, value2);
    }

}

