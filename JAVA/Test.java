package JAVA;

public class Test {
    public static void main(String[] args) {
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
    }

    // ADDITION TEST
    public static void testAddition() {
        ArithmeticOperations calculator = new JavaCalculator();
        int result = calculator.add(2, 3);
        if (result == 5) {
            System.out.println("Addition is Correct!");
        } else {
            System.err.println("Addition Failed: Expected 5 instead of " + result);
        }
    }

    // SUBTRACTION TEST
    public static void testSubtraction() {
        ArithmeticOperations calculator = new JavaCalculator();
        int result = calculator.subtract(8, 6);
        if (result == 2) {
            System.out.println("Subtraction is Correct!");
        } else {
            System.err.println("Subtraction Failed: Expected 2 instead of" + result);
        }
    }

    // MULTIPLICATION TEST
    public static void testMultiplication() {
        ArithmeticOperations calculator = new JavaCalculator();
        int result = calculator.multiply(2, 5);
        if (result == 10) {
            System.out.println("Multiplication is Correct!");
        } else {
            System.err.println("Multiplication Failed: Expected 10 instead of " + result);
        }
    }

    // DIVISION TEST
    public static void testDivision() {
        ArithmeticOperations calculator = new JavaCalculator();
        double result = calculator.divide(10,2);
        if (Math.abs(result - 5.0) < 0.0001) {
            System.out.println("Division is Correct!");
        } else {
            System.err.println("Division Failed: Expected 5 instead of " + result);
        }
    }

}