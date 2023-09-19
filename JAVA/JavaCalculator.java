package JAVA;
/**
 * The JavaCalculator class implements the ArithmeticOperations interface to provide
 * concrete implementations of basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
public class JavaCalculator implements ArithmeticOperations {

    /**
     * Adds two integers together.
     *
     * @param x The first integer.
     * @param y The second integer.
     * @return The result of the addition as an integer.
     */
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    /**
     * Subtracts one integer from another.
     *
     * @param x The first integer (minuend).
     * @param y The second integer (subtrahend).
     * @return The result of the subtraction as an integer.
     */
    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

    /**
     * Multiplies two integers together.
     *
     * @param x The first integer.
     * @param y The second integer.
     * @return The result of the multiplication as an integer.
     */
    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    /**
     * Divides one integer by another and returns the result as a double.
     *
     * @param x The numerator (dividend).
     * @param y The denominator (divisor).
     * @return The result of the division as a double.
     * @throws IllegalArgumentException if the denominator (b) is zero.
     */
    @Override
    public double divide(int x, int y) throws IllegalArgumentException {
        if (y == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed");
        }
        return (double) x / y;
    }

     /**
     * Converts a string containing a numeric representation to a numeric value.
     *
     * @param x A string containing a numeric representation.
     * @return The numeric value parsed from the string.
     * @throws NumberFormatException If the string cannot be parsed as a valid numeric value.
     */
    @Override
    public double convertStringToNumber(String x) throws NumberFormatException {
        try {
            return Double.parseDouble(x);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid numeric string");
        }
    }

    /**
     * Converts a numeric value to a string representation of the numeric value.
     *
     * @param x A numeric value.
     * @return A string representation of the numeric value.
     */
    @Override
    public String convertNumberToString(double x) {
        return Double.toString(x);
    }
}
