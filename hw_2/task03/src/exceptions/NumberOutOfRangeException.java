package exceptions;

public class NumberOutOfRangeException extends Exception {
    public NumberOutOfRangeException(String message) {
        super(message);
    }

    public static void checkNumber1(int number1) throws NumberOutOfRangeException {
        if (number1 > 100) {
            throw new NumberOutOfRangeException("Первое число вне допустимого диапазона");
        }
    }

    public static void checkNumber2(int number2) throws NumberOutOfRangeException {
        if (number2 < 0) {
            throw new NumberOutOfRangeException("Второе число вне допустимого диапазона");
        }
    }
}
