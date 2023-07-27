package exceptions;

public class InvalidNumberException extends Exception {
    public InvalidNumberException(String message) {
        super(message);
    }

    public static void checkPositiveNumber(double number) throws InvalidNumberException {
        // Выбрасываем исключение, если число не удовлетворяет условию
        if (number <= 0) {
            throw new InvalidNumberException("Некорректное число");
        }
    }
}