package exceptions;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }

    public static double divideNumbers(double number1, double number2) throws DivisionByZeroException {
        if (number2 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
        return number1 / number2;
    }
}
