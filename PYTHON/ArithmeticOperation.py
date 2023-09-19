# This library follows the PEP 8 code style guide for Python.

from abc import ABC, abstractmethod

# Abstract Methods
class ArithmeticOperation(ABC):
    @abstractmethod
    def add(self, x, y):
        """
        Abstract method for addition.

        Parameters:
        x (int): The first number.
        y (int): The second number.

        Returns:
        int: The result of the addition.
        """
        pass

    @abstractmethod
    def subtract(self, x, y):
        """
        Abstract method for subtraction.

        Parameters:
        x (int): The first number.
        y (int): The second number.

        Returns:
        int: The result of the subtraction.
        """
        pass

    @abstractmethod
    def multiply(self, x, y):
        """
        Abstract method for multiplication.

        Parameters:
        x (int): The first number.
        y (int): The second number.

        Returns:
        int: The result of the multiplication.
        """
        pass

    @abstractmethod
    def divide(self, a, b):
        """
        Abstract method for division.

        Parameters:
        a (int): The numerator.
        b (int): The denominator.

        Returns:
        float: The result of the division.

        Raises:
        ValueError: If the denominator (b) is zero.
        """
        pass

    @abstractmethod
    def convertStringToNumber(x):
        """
        Abstract method for converting string to number.

        Parameters:
        x (String): String to be converted to a number.

        Returns:
        float: The result of the conversion.

        Raises:
        ValueError: If number is invalid.
        """
        pass

    @abstractmethod
    def convertNumberToString(x):
        """
        Abstract method for converting number to string.

        Parameters:
        x (int): Number to be converted to a string.

        Returns:
        String: The result of the conversion.

        """
        pass


# Concrete Implementation
class PythonCalculator(ArithmeticOperation):
    def add(self, x, y):
        """
        Implementation of addition.

        Parameters:
        x (int): The first number.
        y (int): The second number.

        Returns:
        int: The result of the addition.
        """
        return x + y

    def subtract(self, x, y):
        """
        Implementation of subtraction.

        Parameters:
        x (int): The first number.
        y (int): The second number.

        Returns:
        int: The result of the subtraction.
        """
        return x - y

    def multiply(self, x, y):
        """
        Implementation of multiplication.

        Parameters:
        x (int): The first number.
        y (int): The second number.

        Returns:
        int: The result of the multiplication.
        """
        return x * y

    def divide(self, x, y):
        """
        Implementation of division.

        Parameters:
        x (int): The numerator.
        y (int): The denominator.

        Returns:
        float: The result of the division.

        Raises:
        ValueError: If the denominator (y) is zero.
        """
        if y == 0:
            raise ValueError("Division by zero is not allowed!")
        return x / y
    
    def convertStringToNumber(x):
        """
        Implementation of converting string to number.

        Parameters:
        x (String): String to be converted to a number.

        Returns:
        float: The result of the conversion.

        Raises:
        ValueError: If number is invalid.
        """
        try:
            return float(x)
        except ValueError:
            raise ValueError("Invalid numeric string")

    def convertNumberToString(x):
        """
        Implementation of converting number to string.

        Parameters:
        x (int): Number to be converted to a string.

        Returns:
        String: The result of the conversion.

        """
        return str(x)