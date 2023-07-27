package exceptions;

public class DivisionByZeroException extends Exception {
    public DivisionByZeroException(String message) {
        super(message);
    }

    public static void checkNumber3(int number3) throws DivisionByZeroException {
        if (number3 == 0) {
            throw new DivisionByZeroException("Деление на ноль недопустимо");
        }
    }
}
