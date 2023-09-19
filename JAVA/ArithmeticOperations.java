package JAVA;
/**
 * The ArithmeticOperations interface defines a set of basic arithmetic operations.
 * Implementations of this interface must provide methods for addition, subtraction,
 * multiplication, and division.
 */

public interface ArithmeticOperations {

    /**
     * Adds two integers together.
     *
     * @param x The first integer.
     * @param y The second integer.
     * @return The result of the addition as an integer.
     */
    int add(int x, int y);

    /**
     * Subtracts one integer from another.
     *
     * @param x The first integer (minuend).
     * @param y The second integer (subtrahend).
     * @return The result of the subtraction as an integer.
     */
    int subtract(int x, int y);

    /**
     * Multiplies two integers together.
     *
     * @param x The first integer.
     * @param y The second integer.
     * @return The result of the multiplication as an integer.
     */
    int multiply(int x, int y);

    /**
     * Divides one integer by another and returns the result as a double.
     *
     * @param x The numerator (dividend).
     * @param y The denominator (divisor).
     * @return The result of the division as a double.
     * @throws ArithmeticException if the denominator (y) is zero.
     */
    double divide(int x, int y) throws ArithmeticException;

    /**
     * Converts a string containing a numeric representation to a numeric value.
     *
     * @param x A string containing a numeric representation.
     * @return The numeric value parsed from the string.
     * @throws NumberFormatException If the string cannot be parsed as a valid numeric value.
     */
    double convertStringToNumber(String x) throws NumberFormatException;

    /**
     * Converts a numeric value to a string representation of the numeric value.
     *
     * @param x A numeric value.
     * @return A string representation of the numeric value.
     */
    String convertNumberToString(double x);
}

