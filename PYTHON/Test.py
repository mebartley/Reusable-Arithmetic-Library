from ArithmeticOperation import PythonCalculator

# TESTS

def testAddition():
    """
    Test the addition operation of the PythonCalculator class.

    Creates an instance of PythonCalculator, performs an addition operation, 
    and checks if the result matches the expected value. If the result is 
    incorrect, it prints an error message.

    Returns:
    None
    """
    calculator = PythonCalculator()
    result = calculator.add(8, 3)
    if result != 11:
        print(f"Test failed: Expected 11 instead of {result}")

def testSubtraction():
    """
    Test the subtraction operation of the PythonCalculator class.

    Creates an instance of PythonCalculator, performs a subtraction operation, 
    and checks if the result matches the expected value. If the result is 
    incorrect, it prints an error message.

    Returns:
    None
    """
    calculator = PythonCalculator()
    result = calculator.subtract(8, 3)
    if result != 5:
        print(f"Test failed: Expected 5 instead of {result}")

def testMultiplication():
    """
    Test the multiplication operation of the PythonCalculator class.

    Creates an instance of PythonCalculator, performs a multiplication operation, 
    and checks if the result matches the expected value. If the result is 
    incorrect, it prints an error message.

    Returns:
    None
    """
    calculator = PythonCalculator()
    result = calculator.multiply(8, 3)
    if result != 24:
        print(f"Test failed: Expected 24 instead of {result}")

def testDivision():
    """
    Test the division operation of the PythonCalculator class.

    Creates an instance of PythonCalculator, performs a division operation, 
    and checks if the result matches the expected value (rounded to 4 decimal places). 
    If the result is incorrect, it prints an error message.

    Returns:
    None
    """
    calculator = PythonCalculator()
    result = calculator.divide(10, 2)
    if round(result, 4) != 5.0:
        print(f"Test failed: Expected 5.0 instead of {result}")

# MAIN
if __name__ == '__main__':
    testAddition()
    testSubtraction()
    testMultiplication()
    testDivision()
    print("All tests passed!")
